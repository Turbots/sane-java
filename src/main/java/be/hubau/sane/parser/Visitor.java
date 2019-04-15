package be.hubau.sane.parser;/* -----------------------------------------------------------------------------
 * Visitor.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Mon Apr 15 15:26:09 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

public interface Visitor {
    Object visit(Rule_sane rule);

    Object visit(Rule_expression rule);

    Object visit(Rule_ws rule);

    Object visit(Rule_newline rule);

    Object visit(Rule_comment_start_symbol rule);

    Object visit(Rule_non_eol rule);

    Object visit(Rule_comment rule);

    Object visit(Rule_keyval rule);

    Object visit(Rule_key rule);

    Object visit(Rule_simple_key rule);

    Object visit(Rule_unquoted_key rule);

    Object visit(Rule_quoted_key rule);

    Object visit(Rule_dotted_key rule);

    Object visit(Rule_dot_sep rule);

    Object visit(Rule_keyval_sep rule);

    Object visit(Rule_val rule);

    Object visit(Rule_string rule);

    Object visit(Rule_basic_string rule);

    Object visit(Rule_quotation_mark rule);

    Object visit(Rule_basic_char rule);

    Object visit(Rule_basic_unescaped rule);

    Object visit(Rule_escaped rule);

    Object visit(Rule_escape rule);

    Object visit(Rule_escape_seq_char rule);

    Object visit(Rule_ml_basic_string rule);

    Object visit(Rule_ml_basic_string_delim rule);

    Object visit(Rule_ml_basic_body rule);

    Object visit(Rule_ml_basic_char rule);

    Object visit(Rule_ml_basic_unescaped rule);

    Object visit(Rule_literal_string rule);

    Object visit(Rule_apostrophe rule);

    Object visit(Rule_literal_char rule);

    Object visit(Rule_ml_literal_string rule);

    Object visit(Rule_ml_literal_string_delim rule);

    Object visit(Rule_ml_literal_body rule);

    Object visit(Rule_ml_literal_char rule);

    Object visit(Rule_integer rule);

    Object visit(Rule_minus rule);

    Object visit(Rule_plus rule);

    Object visit(Rule_underscore rule);

    Object visit(Rule_digit1_9 rule);

    Object visit(Rule_digit0_7 rule);

    Object visit(Rule_digit0_1 rule);

    Object visit(Rule_hex_prefix rule);

    Object visit(Rule_oct_prefix rule);

    Object visit(Rule_bin_prefix rule);

    Object visit(Rule_dec_int rule);

    Object visit(Rule_unsigned_dec_int rule);

    Object visit(Rule_hex_int rule);

    Object visit(Rule_oct_int rule);

    Object visit(Rule_bin_int rule);

    Object visit(Rule_float rule);

    Object visit(Rule_float_int_part rule);

    Object visit(Rule_frac rule);

    Object visit(Rule_decimal_point rule);

    Object visit(Rule_zero_prefixable_int rule);

    Object visit(Rule_exp rule);

    Object visit(Rule_special_float rule);

    Object visit(Rule_inf rule);

    Object visit(Rule_nan rule);

    Object visit(Rule_boolean rule);

    Object visit(Rule_true rule);

    Object visit(Rule_false rule);

    Object visit(Rule_list rule);

    Object visit(Rule_list_open rule);

    Object visit(Rule_list_close rule);

    Object visit(Rule_list_values rule);

    Object visit(Rule_list_sep rule);

    Object visit(Rule_ws_comment_newline rule);

    Object visit(Rule_map rule);

    Object visit(Rule_map_open rule);

    Object visit(Rule_map_close rule);

    Object visit(Rule_map_sep rule);

    Object visit(Rule_map_pair rule);

    Object visit(Rule_map_keyvals rule);

    Object visit(Rule_ALPHA rule);

    Object visit(Rule_DIGIT rule);

    Object visit(Rule_HEXDIG rule);

    Object visit(Terminal_StringValue value);

    Object visit(Terminal_NumericValue value);
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
