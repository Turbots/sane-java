package be.hubau.sane.parser;/* -----------------------------------------------------------------------------
 * Rule_apostrophe.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Mon Apr 15 15:26:09 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

import java.util.ArrayList;

final public class Rule_apostrophe extends Rule {
    public Rule_apostrophe(String spelling, ArrayList<Rule> rules) {
        super(spelling, rules);
    }

    public static Rule_apostrophe parse(ParserContext context) {
        context.push("apostrophe");

        boolean parsed = true;
        int s0 = context.index;
        ParserAlternative a0 = new ParserAlternative(s0);

        ArrayList<ParserAlternative> as1 = new ArrayList<ParserAlternative>();
        parsed = false;
        {
            int s1 = context.index;
            ParserAlternative a1 = new ParserAlternative(s1);
            parsed = true;
            if (parsed) {
                boolean f1 = true;
                int c1 = 0;
                for (int i1 = 0; i1 < 1 && f1; i1++) {
                    Rule rule = Terminal_NumericValue.parse(context, "%x27", "[\\x27]", 1);
                    if ((f1 = rule != null)) {
                        a1.add(rule, context.index);
                        c1++;
                    }
                }
                parsed = c1 == 1;
            }
            if (parsed) {
                as1.add(a1);
            }
            context.index = s1;
        }

        ParserAlternative b = ParserAlternative.getBest(as1);

        parsed = b != null;

        if (parsed) {
            a0.add(b.rules, b.end);
            context.index = b.end;
        }

        Rule rule = null;
        if (parsed) {
            rule = new Rule_apostrophe(context.text.substring(a0.start, a0.end), a0.rules);
        } else {
            context.index = s0;
        }

        context.pop("apostrophe", parsed);

        return (Rule_apostrophe) rule;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
