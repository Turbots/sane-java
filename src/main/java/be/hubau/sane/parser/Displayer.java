package be.hubau.sane.parser;/* -----------------------------------------------------------------------------
 * Displayer.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Mon Apr 15 15:26:09 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

import java.util.ArrayList;

public class Displayer implements Visitor {

    public Object visit(Rule_sane rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_expression rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ws rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_newline rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_comment_start_symbol rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_non_eol rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_comment rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_keyval rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_key rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_simple_key rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_unquoted_key rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_quoted_key rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_dotted_key rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_dot_sep rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_keyval_sep rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_val rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_string rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_basic_string rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_quotation_mark rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_basic_char rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_basic_unescaped rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_escaped rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_escape rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_escape_seq_char rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ml_basic_string rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ml_basic_string_delim rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ml_basic_body rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ml_basic_char rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ml_basic_unescaped rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_literal_string rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_apostrophe rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_literal_char rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ml_literal_string rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ml_literal_string_delim rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ml_literal_body rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ml_literal_char rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_integer rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_minus rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_plus rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_underscore rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_digit1_9 rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_digit0_7 rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_digit0_1 rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_hex_prefix rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_oct_prefix rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_bin_prefix rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_dec_int rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_unsigned_dec_int rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_hex_int rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_oct_int rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_bin_int rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_float rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_float_int_part rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_frac rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_decimal_point rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_zero_prefixable_int rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_exp rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_special_float rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_inf rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_nan rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_boolean rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_true rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_false rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_list rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_list_open rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_list_close rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_list_values rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_list_sep rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ws_comment_newline rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_map rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_map_open rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_map_close rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_map_sep rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_map_pair rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_map_keyvals rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_ALPHA rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_DIGIT rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Rule_HEXDIG rule) {
        return visitRules(rule.rules);
    }

    public Object visit(Terminal_StringValue value) {
        System.out.print(value.spelling);
        return null;
    }

    public Object visit(Terminal_NumericValue value) {
        System.out.print(value.spelling);
        return null;
    }

    private Object visitRules(ArrayList<Rule> rules) {
        for (Rule rule : rules)
            rule.accept(this);
        return null;
    }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
