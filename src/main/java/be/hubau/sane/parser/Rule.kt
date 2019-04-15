package be.hubau.sane.parser

import java.util.*

abstract class Rule protected constructor(val spelling: String, val rules: ArrayList<Rule>?) {

    override fun toString(): String {
        return spelling
    }

    override fun equals(other: Any?): Boolean {
        return other is Rule && spelling == other.spelling
    }

    override fun hashCode(): Int {
        return spelling.hashCode()
    }

    operator fun compareTo(rule: Rule): Int {
        return spelling.compareTo(rule.spelling)
    }

    abstract fun accept(visitor: Visitor): Any?
}
