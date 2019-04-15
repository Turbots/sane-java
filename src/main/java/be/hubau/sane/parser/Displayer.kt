package be.hubau.sane.parser

import java.util.*

class Displayer : Visitor {

    override fun visit(rule: Rule_newline): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ws): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_expression): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_sane): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_comment_start_symbol): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_non_eol): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_comment): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_keyval): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_key): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_simple_key): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_unquoted_key): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_quoted_key): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_dotted_key): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_dot_sep): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_keyval_sep): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_val): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_string): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_basic_string): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_quotation_mark): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_basic_char): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_basic_unescaped): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_escaped): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_escape): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_escape_seq_char): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ml_basic_string): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ml_basic_string_delim): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ml_basic_body): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ml_basic_char): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ml_basic_unescaped): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_literal_string): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_apostrophe): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_literal_char): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ml_literal_string): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ml_literal_string_delim): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ml_literal_body): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ml_literal_char): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_integer): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_minus): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_plus): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_underscore): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_digit1_9): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_digit0_7): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_digit0_1): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_hex_prefix): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_oct_prefix): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_bin_prefix): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_dec_int): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_unsigned_dec_int): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_hex_int): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_oct_int): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_bin_int): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_float): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_float_int_part): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_frac): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_decimal_point): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_zero_prefixable_int): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_exp): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_special_float): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_inf): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_nan): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_boolean): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_true): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_false): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_list): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_list_open): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_list_close): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_list_values): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_list_sep): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ws_comment_newline): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_map): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_map_open): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_map_close): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_map_sep): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_map_pair): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_map_keyvals): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_ALPHA): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_DIGIT): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(rule: Rule_HEXDIG): Any? {
        return visitRules(rule.rules)
    }

    override fun visit(value: TerminalStringValue): Any? {
        print(value.spelling)
        return null
    }

    override fun visit(value: TerminalNumericValue): Any? {
        print(value.spelling)
        return null
    }

    private fun visitRules(rules: ArrayList<Rule>?): Any? {
        if (rules != null) {
            for (rule in rules)
                rule.accept(this)
        }
        return null
    }
}