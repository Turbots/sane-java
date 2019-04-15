package be.hubau.sane.parser

import java.util.*

class TerminalStringValue private constructor(spelling: String, rules: ArrayList<Rule>?) : Rule(spelling, rules) {

    override fun accept(visitor: Visitor): Any? {
        return visitor.visit(this)
    }

    companion object {

        fun parse(context: ParserContext, regex: String): TerminalStringValue? {
            context.push("StringValue", regex)

            var parsed: Boolean

            var stringValue: TerminalStringValue? = null
            try {
                val value = context.text.substring(context.index, context.index + regex.length)

                parsed = value.equals(regex, ignoreCase = true)
                if (parsed) {
                    context.index += regex.length
                    stringValue = TerminalStringValue(value, null)
                }
            } catch (e: IndexOutOfBoundsException) {
                parsed = false
            }

            context.pop("StringValue", parsed)

            return stringValue
        }
    }
}