package be.hubau.sane.parser

/* -----------------------------------------------------------------------------
 * be.hubau.sane.parser.Rule_ml_basic_body.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.be.hubau.sane.parser.Parser 2.5
 * Produced : Mon Apr 15 12:53:50 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

import java.util.*

class Rule_ml_basic_body(spelling: String, rules: ArrayList<Rule>) : Rule(spelling, rules) {

    override fun accept(visitor: Visitor): Any? {
        return visitor.visit(this)
    }

    companion object {

        fun parse(context: ParserContext): Rule_ml_basic_body? {
            context.push("ml-basic-body")

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
                                    val rule = Rule_ml_basic_char.parse(context)
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
                                    val rule = Rule_newline.parse(context)
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
                                    val g2 = context.index
                                    val as3 = ArrayList<ParserAlternative>()
                                    parsed = false
                                    run {
                                        val s3 = context.index
                                        val a3 = ParserAlternative(s3)
                                        parsed = true
                                        if (parsed) {
                                            var f3 = true
                                            var c3 = 0
                                            var i3 = 0
                                            while (i3 < 1 && f3) {
                                                val rule = Rule_escape.parse(context)
                                                f3 = rule != null
                                                if (f3) {
                                                    a3.add(rule, context.index)
                                                    c3++
                                                }
                                                i3++
                                            }
                                            parsed = c3 == 1
                                        }
                                        if (parsed) {
                                            var f3 = true
                                            var c3 = 0
                                            var i3 = 0
                                            while (i3 < 1 && f3) {
                                                val rule = Rule_ws.parse(context)
                                                f3 = rule != null
                                                if (f3) {
                                                    a3.add(rule, context.index)
                                                    c3++
                                                }
                                                i3++
                                            }
                                            parsed = c3 == 1
                                        }
                                        if (parsed) {
                                            var f3 = true
                                            var c3 = 0
                                            var i3 = 0
                                            while (i3 < 1 && f3) {
                                                val rule = Rule_newline.parse(context)
                                                f3 = rule != null
                                                if (f3) {
                                                    a3.add(rule, context.index)
                                                    c3++
                                                }
                                                i3++
                                            }
                                            parsed = c3 == 1
                                        }
                                        if (parsed) {
                                            as3.add(a3)
                                        }
                                        context.index = s3
                                    }

                                    val b = ParserAlternative.getBest(as3)

                                    parsed = b != null

                                    if (parsed) {
                                        a2.add(b!!.rules, b.end)
                                        context.index = b.end
                                    }

                                    f2 = context.index > g2
                                    if (parsed) c2++
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
                rule = Rule_ml_basic_body(context.text.substring(a0.start, a0.end), a0.rules)
            } else {
                context.index = s0
            }

            context.pop("ml-basic-body", parsed)

            return rule as Rule_ml_basic_body?
        }
    }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
