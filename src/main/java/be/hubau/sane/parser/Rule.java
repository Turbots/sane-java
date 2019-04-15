package be.hubau.sane.parser;/* -----------------------------------------------------------------------------
 * Rule.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Mon Apr 15 15:26:09 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

import java.util.ArrayList;

public abstract class Rule {
    public final String spelling;
    public final ArrayList<Rule> rules;

    protected Rule(String spelling, ArrayList<Rule> rules) {
        this.spelling = spelling;
        this.rules = rules;
    }

    public String toString() {
        return this.spelling;
    }

    public boolean equals(Object object) {
        return object instanceof Rule && this.spelling.equals(((Rule) object).spelling);
    }

    public int hashCode() {
        return this.spelling.hashCode();
    }

    public int compareTo(Rule rule) {
        return this.spelling.compareTo(rule.spelling);
    }

    public abstract Object accept(Visitor visitor);
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
