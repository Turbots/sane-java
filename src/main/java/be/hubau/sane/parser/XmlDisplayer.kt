package be.hubau.sane.parser

import java.util.*

class XmlDisplayer : Visitor {
    private var terminal = true

    override fun visit(rule: Rule_newline): Any? {
        if (!terminal) println()
        print("<newline>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</newline>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ws): Any? {
        if (!terminal) println()
        print("<ws>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ws>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_expression): Any? {
        if (!terminal) println()
        print("<expression>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</expression>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_sane): Any? {
        if (!terminal) println()
        print("<sane>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</sane>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_comment_start_symbol): Any? {
        if (!terminal) println()
        print("<comment-start-symbol>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</comment-start-symbol>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_non_eol): Any? {
        if (!terminal) println()
        print("<non-eol>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</non-eol>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_comment): Any? {
        if (!terminal) println()
        print("<comment>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</comment>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_keyval): Any? {
        if (!terminal) println()
        print("<keyval>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</keyval>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_key): Any? {
        if (!terminal) println()
        print("<key>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</key>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_simple_key): Any? {
        if (!terminal) println()
        print("<simple-key>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</simple-key>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_unquoted_key): Any? {
        if (!terminal) println()
        print("<unquoted-key>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</unquoted-key>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_quoted_key): Any? {
        if (!terminal) println()
        print("<quoted-key>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</quoted-key>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_dotted_key): Any? {
        if (!terminal) println()
        print("<dotted-key>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</dotted-key>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_dot_sep): Any? {
        if (!terminal) println()
        print("<dot-sep>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</dot-sep>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_keyval_sep): Any? {
        if (!terminal) println()
        print("<keyval-sep>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</keyval-sep>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_val): Any? {
        if (!terminal) println()
        print("<val>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</val>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_string): Any? {
        if (!terminal) println()
        print("<string>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</string>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_basic_string): Any? {
        if (!terminal) println()
        print("<basic-string>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</basic-string>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_quotation_mark): Any? {
        if (!terminal) println()
        print("<quotation-mark>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</quotation-mark>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_basic_char): Any? {
        if (!terminal) println()
        print("<basic-char>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</basic-char>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_basic_unescaped): Any? {
        if (!terminal) println()
        print("<basic-unescaped>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</basic-unescaped>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_escaped): Any? {
        if (!terminal) println()
        print("<escaped>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</escaped>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_escape): Any? {
        if (!terminal) println()
        print("<escape>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</escape>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_escape_seq_char): Any? {
        if (!terminal) println()
        print("<escape-seq-char>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</escape-seq-char>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ml_basic_string): Any? {
        if (!terminal) println()
        print("<ml-basic-string>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ml-basic-string>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ml_basic_string_delim): Any? {
        if (!terminal) println()
        print("<ml-basic-string-delim>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ml-basic-string-delim>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ml_basic_body): Any? {
        if (!terminal) println()
        print("<ml-basic-body>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ml-basic-body>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ml_basic_char): Any? {
        if (!terminal) println()
        print("<ml-basic-char>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ml-basic-char>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ml_basic_unescaped): Any? {
        if (!terminal) println()
        print("<ml-basic-unescaped>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ml-basic-unescaped>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_literal_string): Any? {
        if (!terminal) println()
        print("<literal-string>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</literal-string>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_apostrophe): Any? {
        if (!terminal) println()
        print("<apostrophe>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</apostrophe>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_literal_char): Any? {
        if (!terminal) println()
        print("<literal-char>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</literal-char>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ml_literal_string): Any? {
        if (!terminal) println()
        print("<ml-literal-string>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ml-literal-string>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ml_literal_string_delim): Any? {
        if (!terminal) println()
        print("<ml-literal-string-delim>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ml-literal-string-delim>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ml_literal_body): Any? {
        if (!terminal) println()
        print("<ml-literal-body>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ml-literal-body>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ml_literal_char): Any? {
        if (!terminal) println()
        print("<ml-literal-char>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ml-literal-char>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_integer): Any? {
        if (!terminal) println()
        print("<integer>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</integer>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_minus): Any? {
        if (!terminal) println()
        print("<minus>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</minus>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_plus): Any? {
        if (!terminal) println()
        print("<plus>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</plus>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_underscore): Any? {
        if (!terminal) println()
        print("<underscore>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</underscore>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_digit1_9): Any? {
        if (!terminal) println()
        print("<digit1-9>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</digit1-9>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_digit0_7): Any? {
        if (!terminal) println()
        print("<digit0-7>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</digit0-7>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_digit0_1): Any? {
        if (!terminal) println()
        print("<digit0-1>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</digit0-1>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_hex_prefix): Any? {
        if (!terminal) println()
        print("<hex-prefix>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</hex-prefix>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_oct_prefix): Any? {
        if (!terminal) println()
        print("<oct-prefix>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</oct-prefix>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_bin_prefix): Any? {
        if (!terminal) println()
        print("<bin-prefix>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</bin-prefix>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_dec_int): Any? {
        if (!terminal) println()
        print("<dec-int>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</dec-int>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_unsigned_dec_int): Any? {
        if (!terminal) println()
        print("<unsigned-dec-int>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</unsigned-dec-int>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_hex_int): Any? {
        if (!terminal) println()
        print("<hex-int>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</hex-int>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_oct_int): Any? {
        if (!terminal) println()
        print("<oct-int>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</oct-int>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_bin_int): Any? {
        if (!terminal) println()
        print("<bin-int>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</bin-int>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_float): Any? {
        if (!terminal) println()
        print("<float>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</float>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_float_int_part): Any? {
        if (!terminal) println()
        print("<float-int-part>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</float-int-part>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_frac): Any? {
        if (!terminal) println()
        print("<frac>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</frac>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_decimal_point): Any? {
        if (!terminal) println()
        print("<decimal-point>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</decimal-point>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_zero_prefixable_int): Any? {
        if (!terminal) println()
        print("<zero-prefixable-int>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</zero-prefixable-int>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_exp): Any? {
        if (!terminal) println()
        print("<exp>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</exp>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_special_float): Any? {
        if (!terminal) println()
        print("<special-float>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</special-float>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_inf): Any? {
        if (!terminal) println()
        print("<inf>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</inf>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_nan): Any? {
        if (!terminal) println()
        print("<nan>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</nan>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_boolean): Any? {
        if (!terminal) println()
        print("<boolean>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</boolean>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_true): Any? {
        if (!terminal) println()
        print("<true>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</true>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_false): Any? {
        if (!terminal) println()
        print("<false>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</false>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_list): Any? {
        if (!terminal) println()
        print("<list>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</list>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_list_open): Any? {
        if (!terminal) println()
        print("<list-open>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</list-open>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_list_close): Any? {
        if (!terminal) println()
        print("<list-close>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</list-close>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_list_values): Any? {
        if (!terminal) println()
        print("<list-values>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</list-values>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_list_sep): Any? {
        if (!terminal) println()
        print("<list-sep>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</list-sep>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ws_comment_newline): Any? {
        if (!terminal) println()
        print("<ws-comment-newline>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ws-comment-newline>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_map): Any? {
        if (!terminal) println()
        print("<map>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</map>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_map_open): Any? {
        if (!terminal) println()
        print("<map-open>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</map-open>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_map_close): Any? {
        if (!terminal) println()
        print("<map-close>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</map-close>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_map_sep): Any? {
        if (!terminal) println()
        print("<map-sep>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</map-sep>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_map_pair): Any? {
        if (!terminal) println()
        print("<map-pair>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</map-pair>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_map_keyvals): Any? {
        if (!terminal) println()
        print("<map-keyvals>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</map-keyvals>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_ALPHA): Any? {
        if (!terminal) println()
        print("<ALPHA>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</ALPHA>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_DIGIT): Any? {
        if (!terminal) println()
        print("<DIGIT>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</DIGIT>")
        terminal = false
        return null
    }

    override fun visit(rule: Rule_HEXDIG): Any? {
        if (!terminal) println()
        print("<HEXDIG>")
        terminal = false
        visitRules(rule.rules)
        if (!terminal) println()
        print("</HEXDIG>")
        terminal = false
        return null
    }

    override fun visit(value: TerminalStringValue): Any? {
        print(value.spelling)
        terminal = true
        return null
    }

    override fun visit(value: TerminalNumericValue): Any? {
        print(value.spelling)
        terminal = true
        return null
    }

    private fun visitRules(rules: ArrayList<Rule>?): Boolean? {
        if (rules != null) {
            for (rule in rules)
                rule.accept(this)
        }
        return null
    }
}