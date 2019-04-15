package be.hubau.sane.parser;/* -----------------------------------------------------------------------------
 * Rule_ws.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Mon Apr 15 15:26:09 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

import java.util.ArrayList;

final public class Rule_ws extends Rule {
    public Rule_ws(String spelling, ArrayList<Rule> rules) {
        super(spelling, rules);
    }

    public static Rule_ws parse(ParserContext context) {
        context.push("ws");

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
                @SuppressWarnings("unused")
                int c1 = 0;
                while (f1) {
                    Rule rule = Terminal_NumericValue.parse(context, "%x20", "[\\x20]", 1);
                    if ((f1 = rule != null)) {
                        a1.add(rule, context.index);
                        c1++;
                    }
                }
                parsed = true;
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
            rule = new Rule_ws(context.text.substring(a0.start, a0.end), a0.rules);
        } else {
            context.index = s0;
        }

        context.pop("ws", parsed);

        return (Rule_ws) rule;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
