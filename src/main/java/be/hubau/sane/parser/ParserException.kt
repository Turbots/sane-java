package be.hubau.sane.parser

import java.util.*

/**
 * Signals that a parse failure has occurred.
 */

class ParserException

/**
 * Creates a parser exception from the specified parse failure information.
 *
 * @param reason A description of the parse failure.
 * @param text The string of characters being parsed.
 * @param index The index to the character at which the parse failure occurred.
 * @param ruleStack The ABNF rule stack at the point the parse failure occurred.
 */
(private val reason: String, text: String, index: Int, private val ruleStack: Stack<String>) : BaseException() {
    /**
     * Returns a substring of the parsed string that encompasses the point
     * at which the parse failure occurred. The substring will be up to 60
     * characters in length unless the point of failure occurred within
     * 30 characters of the start or end of the parsed string.
     * [.getSubstringIndex] returns an index to the character within
     * this substring at which the parse failure occurred. This substring
     * may contain non-printable characters.
     *
     * @return The substring that encompasses the point of failure.
     */
    val substring: String

    /**
     * Returns an index to the character within the substring returned by
     * [.getSubstring] at which the parse failure occurred.
     *
     * @return The index to the character within the substring returned
     * [.getSubstring] at which the parse failure occurred.
     */
    private val substringIndex: Int

    init {
        val start = if (index < 30) 0 else index - 30
        val end = if (text.length < index + 30) text.length else index + 30
        substring = text.substring(start, end).replace("[\\x00-\\x1F]".toRegex(), " ")
        substringIndex = if (index < 30) index else 30
    }

    override fun errorMessage(): String {
        val marker = "                              "

        val buffer = StringBuffer()
        buffer.append(reason + newline)
        buffer.append(substring + newline)
        buffer.append(marker.substring(0, substringIndex) + "^" + newline)

        if (!ruleStack.empty()) {
            buffer.append("rule stack:")

            for (rule in ruleStack)
                buffer.append("$newline  $rule")
        }

        if (cause != null) {
            val secondaryError = cause as ParserException
            buffer.append("possible cause: " + secondaryError.reason + newline)
            buffer.append(secondaryError.substring + newline)
            buffer.append(marker.substring(0, secondaryError.substringIndex) + "^" + newline)

            if (!secondaryError.ruleStack.empty()) {
                buffer.append("rule stack:")

                for (rule in secondaryError.ruleStack)
                    buffer.append("$newline  $rule")
            }
        }

        return buffer.toString()
    }

    companion object {
        private val newline = System.getProperty("line.separator", "\n")
    }
}