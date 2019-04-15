package be.hubau.sane.parser;/* -----------------------------------------------------------------------------
 * Rule_dot_sep.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Mon Apr 15 15:26:09 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

import java.util.ArrayList;

final public class Rule_dot_sep extends Rule {
    public Rule_dot_sep(String spelling, ArrayList<Rule> rules) {
        super(spelling, rules);
    }

    public static Rule_dot_sep parse(ParserContext context) {
        context.push("dot-sep");

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
                    Rule rule = Rule_ws.parse(context);
                    if ((f1 = rule != null)) {
                        a1.add(rule, context.index);
                        c1++;
                    }
                }
                parsed = c1 == 1;
            }
          parsed = Rule_decimal_point.parseTerminalNumericValues(context, parsed, a1);
          if (parsed) {
                boolean f1 = true;
                int c1 = 0;
                for (int i1 = 0; i1 < 1 && f1; i1++) {
                    Rule rule = Rule_ws.parse(context);
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
            rule = new Rule_dot_sep(context.text.substring(a0.start, a0.end), a0.rules);
        } else {
            context.index = s0;
        }

        context.pop("dot-sep", parsed);

        return (Rule_dot_sep) rule;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
