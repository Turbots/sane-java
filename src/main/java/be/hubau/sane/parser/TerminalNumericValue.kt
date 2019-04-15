package be.hubau.sane.parser

import java.util.*
import java.util.regex.Pattern

class TerminalNumericValue private constructor(spelling: String, rules: ArrayList<Rule>?) : Rule(spelling, rules) {

    override fun accept(visitor: Visitor): Any? {
        return visitor.visit(this)
    }

    companion object {

        fun parse(
                context: ParserContext,
                spelling: String,
                regex: String,
                length: Int): TerminalNumericValue? {
            context.push("NumericValue", "$spelling,$regex")

            var parsed: Boolean

            var numericValue: TerminalNumericValue? = null
            try {
                val value = context.text.substring(context.index, context.index + length)

                parsed = Pattern.matches(regex, value)
                if (parsed) {
                    context.index += length
                    numericValue = TerminalNumericValue(value, null)
                }
            } catch (e: IndexOutOfBoundsException) {
                parsed = false
            }

            context.pop("NumericValue", parsed)

            return numericValue
        }
    }
}