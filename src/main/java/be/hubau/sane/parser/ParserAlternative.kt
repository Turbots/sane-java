package be.hubau.sane.parser

import java.util.*

class ParserAlternative(var start: Int) {
    var rules: ArrayList<Rule> = ArrayList()
    var end: Int = 0

    init {
        this.end = start
    }

    fun add(rule: Rule?, end: Int) {
        if (rule != null) {
            this.rules.add(rule)
            this.end = end
        }
    }

    fun add(rules: ArrayList<Rule>, end: Int) {
        this.rules.addAll(rules)
        this.end = end
    }

    companion object {

        fun getBest(alternatives: List<ParserAlternative>): ParserAlternative? {
            var best: ParserAlternative? = null

            for (alternative in alternatives) {
                if (best == null || alternative.end > best.end)
                    best = alternative
            }

            return best
        }
    }
}