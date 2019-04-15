package be.hubau.sane.parser

/* -----------------------------------------------------------------------------
 * be.hubau.sane.parser.Rule_nan.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.be.hubau.sane.parser.Parser 2.5
 * Produced : Mon Apr 15 12:53:50 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

import java.util.*

class Rule_nan(spelling: String, rules: ArrayList<Rule>) : Rule(spelling, rules) {

    override fun accept(visitor: Visitor): Any? {
        return visitor.visit(this)
    }

    companion object {

        fun parse(context: ParserContext): Rule_nan? {
            context.push("nan")

            var parsed : Boolean
            val s0 = context.index
            val a0 = ParserAlternative(s0)

            val as1 = ArrayList<ParserAlternative>()
            parsed = false
            run {
                val s1 = context.index
                val a1 = ParserAlternative(s1)
                parsed = true
                if (parsed) {
                    var f1 = true
                    var c1 = 0
                    var i1 = 0
                    while (i1 < 1 && f1) {
                        val rule = TerminalNumericValue.parse(context, "%x6e.61.6e", "(\\x6e\\x61\\x6e)", 3)
                        f1 = rule != null
                        if (f1) {
                            a1.add(rule, context.index)
                            c1++
                        }
                        i1++
                    }
                    parsed = c1 == 1
                }
                if (parsed) {
                    as1.add(a1)
                }
                context.index = s1
            }

            val b = ParserAlternative.getBest(as1)

            parsed = b != null

            if (parsed) {
                a0.add(b!!.rules, b.end)
                context.index = b.end
            }

            var rule: Rule? = null
            if (parsed) {
                rule = Rule_nan(context.text.substring(a0.start, a0.end), a0.rules)
            } else {
                context.index = s0
            }

            context.pop("nan", parsed)

            return rule as Rule_nan?
        }
    }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
