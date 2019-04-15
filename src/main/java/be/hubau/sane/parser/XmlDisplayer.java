package be.hubau.sane.parser;/* -----------------------------------------------------------------------------
 * XmlDisplayer.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Mon Apr 15 15:26:09 CEST 2019
 *
 * -----------------------------------------------------------------------------
 */

import java.util.ArrayList;

public class XmlDisplayer implements Visitor {
    private boolean terminal = true;

    public Object visit(Rule_sane rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<sane>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</sane>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_expression rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<expression>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</expression>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ws rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ws>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ws>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_newline rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<newline>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</newline>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_comment_start_symbol rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<comment-start-symbol>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</comment-start-symbol>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_non_eol rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<non-eol>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</non-eol>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_comment rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<comment>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</comment>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_keyval rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<keyval>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</keyval>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_key rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<key>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</key>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_simple_key rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<simple-key>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</simple-key>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_unquoted_key rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<unquoted-key>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</unquoted-key>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_quoted_key rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<quoted-key>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</quoted-key>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_dotted_key rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<dotted-key>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</dotted-key>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_dot_sep rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<dot-sep>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</dot-sep>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_keyval_sep rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<keyval-sep>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</keyval-sep>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_val rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<val>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</val>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_string rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<string>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</string>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_basic_string rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<basic-string>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</basic-string>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_quotation_mark rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<quotation-mark>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</quotation-mark>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_basic_char rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<basic-char>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</basic-char>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_basic_unescaped rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<basic-unescaped>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</basic-unescaped>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_escaped rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<escaped>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</escaped>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_escape rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<escape>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</escape>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_escape_seq_char rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<escape-seq-char>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</escape-seq-char>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ml_basic_string rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ml-basic-string>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ml-basic-string>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ml_basic_string_delim rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ml-basic-string-delim>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ml-basic-string-delim>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ml_basic_body rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ml-basic-body>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ml-basic-body>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ml_basic_char rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ml-basic-char>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ml-basic-char>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ml_basic_unescaped rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ml-basic-unescaped>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ml-basic-unescaped>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_literal_string rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<literal-string>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</literal-string>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_apostrophe rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<apostrophe>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</apostrophe>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_literal_char rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<literal-char>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</literal-char>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ml_literal_string rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ml-literal-string>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ml-literal-string>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ml_literal_string_delim rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ml-literal-string-delim>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ml-literal-string-delim>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ml_literal_body rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ml-literal-body>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ml-literal-body>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ml_literal_char rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ml-literal-char>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ml-literal-char>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_integer rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<integer>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</integer>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_minus rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<minus>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</minus>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_plus rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<plus>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</plus>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_underscore rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<underscore>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</underscore>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_digit1_9 rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<digit1-9>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</digit1-9>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_digit0_7 rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<digit0-7>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</digit0-7>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_digit0_1 rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<digit0-1>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</digit0-1>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_hex_prefix rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<hex-prefix>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</hex-prefix>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_oct_prefix rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<oct-prefix>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</oct-prefix>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_bin_prefix rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<bin-prefix>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</bin-prefix>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_dec_int rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<dec-int>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</dec-int>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_unsigned_dec_int rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<unsigned-dec-int>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</unsigned-dec-int>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_hex_int rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<hex-int>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</hex-int>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_oct_int rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<oct-int>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</oct-int>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_bin_int rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<bin-int>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</bin-int>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_float rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<float>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</float>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_float_int_part rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<float-int-part>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</float-int-part>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_frac rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<frac>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</frac>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_decimal_point rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<decimal-point>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</decimal-point>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_zero_prefixable_int rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<zero-prefixable-int>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</zero-prefixable-int>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_exp rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<exp>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</exp>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_special_float rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<special-float>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</special-float>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_inf rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<inf>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</inf>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_nan rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<nan>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</nan>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_boolean rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<boolean>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</boolean>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_true rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<true>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</true>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_false rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<false>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</false>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_list rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<list>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</list>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_list_open rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<list-open>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</list-open>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_list_close rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<list-close>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</list-close>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_list_values rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<list-values>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</list-values>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_list_sep rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<list-sep>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</list-sep>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ws_comment_newline rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ws-comment-newline>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ws-comment-newline>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_map rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<map>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</map>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_map_open rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<map-open>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</map-open>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_map_close rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<map-close>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</map-close>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_map_sep rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<map-sep>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</map-sep>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_map_pair rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<map-pair>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</map-pair>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_map_keyvals rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<map-keyvals>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</map-keyvals>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_ALPHA rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<ALPHA>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</ALPHA>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_DIGIT rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<DIGIT>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</DIGIT>");
        this.terminal = false;
        return null;
    }

    public Object visit(Rule_HEXDIG rule) {
        if (!this.terminal) System.out.println();
        System.out.print("<HEXDIG>");
        this.terminal = false;
        visitRules(rule.rules);
        if (!this.terminal) System.out.println();
        System.out.print("</HEXDIG>");
        this.terminal = false;
        return null;
    }

    public Object visit(Terminal_StringValue value) {
        System.out.print(value.spelling);
        this.terminal = true;
        return null;
    }

    public Object visit(Terminal_NumericValue value) {
        System.out.print(value.spelling);
        this.terminal = true;
        return null;
    }

    private Boolean visitRules(ArrayList<Rule> rules) {
        for (Rule rule : rules)
            rule.accept(this);
        return null;
    }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
