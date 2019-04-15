package be.hubau.sane.parser

/* -----------------------------------------------------------------------------
 * be.hubau.sane.parser.Rule_zero_prefixable_int.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.be.hubau.sane.parser.Parser 2.5
 * Produced : Mon Apr 15 12:53:50 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

import java.util.*

class Rule_zero_prefixable_int(spelling: String, rules: ArrayList<Rule>) : Rule(spelling, rules) {

    override fun accept(visitor: Visitor): Any? {
        return visitor.visit(this)
    }

    companion object {

        fun parse(context: ParserContext): Rule_zero_prefixable_int? {
            context.push("zero-prefixable-int")

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
                        val rule = Rule_DIGIT.parse(context)
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
                    var f1 = true
                    var c1 = 0
                    while (f1) {
                        val g1 = context.index
                        val as2 = ArrayList<ParserAlternative>()
                        parsed = false
                        run {
                            val s2 = context.index
                            val a2 = ParserAlternative(s2)
                            parsed = true
                            if (parsed) {
                                var f2 = true
                                var c2 = 0
                                var i2 = 0
                                while (i2 < 1 && f2) {
                                    val rule = Rule_DIGIT.parse(context)
                                    f2 = rule != null
                                    if (f2) {
                                        a2.add(rule, context.index)
                                        c2++
                                    }
                                    i2++
                                }
                                parsed = c2 == 1
                            }
                            if (parsed) {
                                as2.add(a2)
                            }
                            context.index = s2
                        }
                        run {
                            val s2 = context.index
                            val a2 = ParserAlternative(s2)
                            parsed = true
                            if (parsed) {
                                var f2 = true
                                var c2 = 0
                                var i2 = 0
                                while (i2 < 1 && f2) {
                                    val rule = Rule_underscore.parse(context)
                                    f2 = rule != null
                                    if (f2) {
                                        a2.add(rule, context.index)
                                        c2++
                                    }
                                    i2++
                                }
                                parsed = c2 == 1
                            }
                            if (parsed) {
                                var f2 = true
                                var c2 = 0
                                var i2 = 0
                                while (i2 < 1 && f2) {
                                    val rule = Rule_DIGIT.parse(context)
                                    f2 = rule != null
                                    if (f2) {
                                        a2.add(rule, context.index)
                                        c2++
                                    }
                                    i2++
                                }
                                parsed = c2 == 1
                            }
                            if (parsed) {
                                as2.add(a2)
                            }
                            context.index = s2
                        }

                        val b = ParserAlternative.getBest(as2)

                        parsed = b != null

                        if (parsed) {
                            a1.add(b!!.rules, b.end)
                            context.index = b.end
                        }

                        f1 = context.index > g1
                        if (parsed) c1++
                    }
                    parsed = true
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
                rule = Rule_zero_prefixable_int(context.text.substring(a0.start, a0.end), a0.rules)
            } else {
                context.index = s0
            }

            context.pop("zero-prefixable-int", parsed)

            return rule as Rule_zero_prefixable_int?
        }
    }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
