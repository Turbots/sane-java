package be.hubau.sane.parser;/* -----------------------------------------------------------------------------
 * Rule_decimal_point.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Mon Apr 15 15:26:09 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

import java.util.ArrayList;

final public class Rule_decimal_point extends Rule {
    public Rule_decimal_point(String spelling, ArrayList<Rule> rules) {
        super(spelling, rules);
    }

    public static Rule_decimal_point parse(ParserContext context) {
        context.push("decimal-point");

        boolean parsed;
        int s0 = context.index;
        ParserAlternative a0 = new ParserAlternative(s0);

        ArrayList<ParserAlternative> as1 = new ArrayList<ParserAlternative>();
        int s1 = context.index;
        ParserAlternative a1 = new ParserAlternative(s1);
        parsed = true;
        parsed = parseTerminalNumericValues(context, parsed, a1);
        if (parsed) {
            as1.add(a1);
        }
        context.index = s1;

        ParserAlternative b = ParserAlternative.getBest(as1);

        parsed = b != null;

        if (parsed) {
            a0.add(b.rules, b.end);
            context.index = b.end;
        }

        Rule_decimal_point rule = null;
        if (parsed) {
            rule = new Rule_decimal_point(context.text.substring(a0.start, a0.end), a0.rules);
        }

        context.pop("decimal-point", parsed);

        return rule;
    }

    static boolean parseTerminalNumericValues(ParserContext context, boolean parsed, ParserAlternative a1) {
        if (parsed) {
            boolean f1 = true;
            int c1 = 0;
            for (int i1 = 0; i1 < 1 && f1; i1++) {
                Rule rule = Terminal_NumericValue.parse(context, "%x2E", "[\\x2E]", 1);
                if ((f1 = rule != null)) {
                    a1.add(rule, context.index);
                    c1++;
                }
            }
            parsed = c1 == 1;
        }
        return parsed;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}