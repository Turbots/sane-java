package be.hubau.sane.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Stack;

public class Parser {

    static public void main(String[] args) {
        Properties arguments = new Properties();
        String error = "";
        boolean ok = args.length > 0;

        if (ok) {
            arguments.setProperty("Rule", "sane");

            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                    case "-visitor":
                        arguments.setProperty("Visitor", args[++i]);
                        break;
                    case "-file":
                        arguments.setProperty("File", args[++i]);
                        break;
                    case "-string":
                        arguments.setProperty("String", args[++i]);
                        break;
                    case "-rule":
                        arguments.setProperty("Rule", args[++i]);
                        break;
                    default:
                        error = "unknown argument: " + args[i];
                        ok = false;
                        break;
                }
            }
        }

        if (ok) {
            if (arguments.getProperty("File") == null &&
                    arguments.getProperty("String") == null) {
                error = "insufficient arguments: -file or -string required";
                ok = false;
            }
        }

        if (ok) {
            try {
                Rule rule = null;
                Parser parser = new Parser();

                if (arguments.getProperty("File") != null) {
                    rule = parser.parse(arguments.getProperty("Rule"), new File(arguments.getProperty("File")));
                } else if (arguments.getProperty("String") != null) {
                    rule = parser.parse(arguments.getProperty("Rule"), arguments.getProperty("String"));
                }

                if (arguments.getProperty("Visitor") != null) {
                    Visitor visitor = (Visitor) Class.forName(arguments.getProperty("Visitor")).newInstance();
                    rule.accept(visitor);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("argument error: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("io error: " + e.getMessage());
            } catch (ParserException e) {
                System.out.println("parser error: " + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("visitor error: class not found - " + e.getMessage());
            } catch (IllegalAccessException e) {
                System.out.println("visitor error: illegal access - " + e.getMessage());
            } catch (InstantiationException e) {
                System.out.println("visitor error: instantiation failure - " + e.getMessage());
            }
        } else {
            System.out.println("error: " + error);
            System.out.println("usage: Parser [-rule rulename] <-file file | -string string> [-visitor visitor]");
        }
    }

    public Rule parse(String ruleName, String string) throws IllegalArgumentException, ParserException {
        if (ruleName == null)
            throw new IllegalArgumentException("null ruleName");
        if (string == null)
            throw new IllegalArgumentException("null string");

        ParserContext context = new ParserContext(string);

        Rule rule;
        if (ruleName.equalsIgnoreCase("sane")) rule = Rule_sane.parse(context);
        else if (ruleName.equalsIgnoreCase("expression")) rule = Rule_expression.parse(context);
        else if (ruleName.equalsIgnoreCase("ws")) rule = Rule_ws.parse(context);
        else if (ruleName.equalsIgnoreCase("newline")) rule = Rule_newline.parse(context);
        else if (ruleName.equalsIgnoreCase("comment-start-symbol")) rule = Rule_comment_start_symbol.parse(context);
        else if (ruleName.equalsIgnoreCase("non-eol")) rule = Rule_non_eol.parse(context);
        else if (ruleName.equalsIgnoreCase("comment")) rule = Rule_comment.parse(context);
        else if (ruleName.equalsIgnoreCase("keyval")) rule = Rule_keyval.parse(context);
        else if (ruleName.equalsIgnoreCase("key")) rule = Rule_key.parse(context);
        else if (ruleName.equalsIgnoreCase("simple-key")) rule = Rule_simple_key.parse(context);
        else if (ruleName.equalsIgnoreCase("unquoted-key")) rule = Rule_unquoted_key.parse(context);
        else if (ruleName.equalsIgnoreCase("quoted-key")) rule = Rule_quoted_key.parse(context);
        else if (ruleName.equalsIgnoreCase("dotted-key")) rule = Rule_dotted_key.parse(context);
        else if (ruleName.equalsIgnoreCase("dot-sep")) rule = Rule_dot_sep.parse(context);
        else if (ruleName.equalsIgnoreCase("keyval-sep")) rule = Rule_keyval_sep.parse(context);
        else if (ruleName.equalsIgnoreCase("val")) rule = Rule_val.parse(context);
        else if (ruleName.equalsIgnoreCase("string")) rule = Rule_string.parse(context);
        else if (ruleName.equalsIgnoreCase("basic-string")) rule = Rule_basic_string.parse(context);
        else if (ruleName.equalsIgnoreCase("quotation-mark")) rule = Rule_quotation_mark.parse(context);
        else if (ruleName.equalsIgnoreCase("basic-char")) rule = Rule_basic_char.parse(context);
        else if (ruleName.equalsIgnoreCase("basic-unescaped")) rule = Rule_basic_unescaped.parse(context);
        else if (ruleName.equalsIgnoreCase("escaped")) rule = Rule_escaped.parse(context);
        else if (ruleName.equalsIgnoreCase("escape")) rule = Rule_escape.parse(context);
        else if (ruleName.equalsIgnoreCase("escape-seq-char")) rule = Rule_escape_seq_char.parse(context);
        else if (ruleName.equalsIgnoreCase("ml-basic-string")) rule = Rule_ml_basic_string.parse(context);
        else if (ruleName.equalsIgnoreCase("ml-basic-string-delim")) rule = Rule_ml_basic_string_delim.parse(context);
        else if (ruleName.equalsIgnoreCase("ml-basic-body")) rule = Rule_ml_basic_body.parse(context);
        else if (ruleName.equalsIgnoreCase("ml-basic-char")) rule = Rule_ml_basic_char.parse(context);
        else if (ruleName.equalsIgnoreCase("ml-basic-unescaped")) rule = Rule_ml_basic_unescaped.parse(context);
        else if (ruleName.equalsIgnoreCase("literal-string")) rule = Rule_literal_string.parse(context);
        else if (ruleName.equalsIgnoreCase("apostrophe")) rule = Rule_apostrophe.parse(context);
        else if (ruleName.equalsIgnoreCase("literal-char")) rule = Rule_literal_char.parse(context);
        else if (ruleName.equalsIgnoreCase("ml-literal-string")) rule = Rule_ml_literal_string.parse(context);
        else if (ruleName.equalsIgnoreCase("ml-literal-string-delim"))
            rule = Rule_ml_literal_string_delim.parse(context);
        else if (ruleName.equalsIgnoreCase("ml-literal-body")) rule = Rule_ml_literal_body.parse(context);
        else if (ruleName.equalsIgnoreCase("ml-literal-char")) rule = Rule_ml_literal_char.parse(context);
        else if (ruleName.equalsIgnoreCase("integer")) rule = Rule_integer.parse(context);
        else if (ruleName.equalsIgnoreCase("minus")) rule = Rule_minus.parse(context);
        else if (ruleName.equalsIgnoreCase("plus")) rule = Rule_plus.parse(context);
        else if (ruleName.equalsIgnoreCase("underscore")) rule = Rule_underscore.parse(context);
        else if (ruleName.equalsIgnoreCase("digit1-9")) rule = Rule_digit1_9.parse(context);
        else if (ruleName.equalsIgnoreCase("digit0-7")) rule = Rule_digit0_7.parse(context);
        else if (ruleName.equalsIgnoreCase("digit0-1")) rule = Rule_digit0_1.parse(context);
        else if (ruleName.equalsIgnoreCase("hex-prefix")) rule = Rule_hex_prefix.parse(context);
        else if (ruleName.equalsIgnoreCase("oct-prefix")) rule = Rule_oct_prefix.parse(context);
        else if (ruleName.equalsIgnoreCase("bin-prefix")) rule = Rule_bin_prefix.parse(context);
        else if (ruleName.equalsIgnoreCase("dec-int")) rule = Rule_dec_int.parse(context);
        else if (ruleName.equalsIgnoreCase("unsigned-dec-int")) rule = Rule_unsigned_dec_int.parse(context);
        else if (ruleName.equalsIgnoreCase("hex-int")) rule = Rule_hex_int.parse(context);
        else if (ruleName.equalsIgnoreCase("oct-int")) rule = Rule_oct_int.parse(context);
        else if (ruleName.equalsIgnoreCase("bin-int")) rule = Rule_bin_int.parse(context);
        else if (ruleName.equalsIgnoreCase("float")) rule = Rule_float.parse(context);
        else if (ruleName.equalsIgnoreCase("float-int-part")) rule = Rule_float_int_part.parse(context);
        else if (ruleName.equalsIgnoreCase("frac")) rule = Rule_frac.parse(context);
        else if (ruleName.equalsIgnoreCase("decimal-point")) rule = Rule_decimal_point.parse(context);
        else if (ruleName.equalsIgnoreCase("zero-prefixable-int")) rule = Rule_zero_prefixable_int.parse(context);
        else if (ruleName.equalsIgnoreCase("exp")) rule = Rule_exp.parse(context);
        else if (ruleName.equalsIgnoreCase("special-float")) rule = Rule_special_float.parse(context);
        else if (ruleName.equalsIgnoreCase("inf")) rule = Rule_inf.parse(context);
        else if (ruleName.equalsIgnoreCase("nan")) rule = Rule_nan.parse(context);
        else if (ruleName.equalsIgnoreCase("boolean")) rule = Rule_boolean.parse(context);
        else if (ruleName.equalsIgnoreCase("true")) rule = Rule_true.parse(context);
        else if (ruleName.equalsIgnoreCase("false")) rule = Rule_false.parse(context);
        else if (ruleName.equalsIgnoreCase("list")) rule = Rule_list.parse(context);
        else if (ruleName.equalsIgnoreCase("list-open")) rule = Rule_list_open.parse(context);
        else if (ruleName.equalsIgnoreCase("list-close")) rule = Rule_list_close.parse(context);
        else if (ruleName.equalsIgnoreCase("list-values")) rule = Rule_list_values.parse(context);
        else if (ruleName.equalsIgnoreCase("list-sep")) rule = Rule_list_sep.parse(context);
        else if (ruleName.equalsIgnoreCase("ws-comment-newline")) rule = Rule_ws_comment_newline.parse(context);
        else if (ruleName.equalsIgnoreCase("map")) rule = Rule_map.parse(context);
        else if (ruleName.equalsIgnoreCase("map-open")) rule = Rule_map_open.parse(context);
        else if (ruleName.equalsIgnoreCase("map-close")) rule = Rule_map_close.parse(context);
        else if (ruleName.equalsIgnoreCase("map-sep")) rule = Rule_map_sep.parse(context);
        else if (ruleName.equalsIgnoreCase("map-pair")) rule = Rule_map_pair.parse(context);
        else if (ruleName.equalsIgnoreCase("map-keyvals")) rule = Rule_map_keyvals.parse(context);
        else if (ruleName.equalsIgnoreCase("ALPHA")) rule = Rule_ALPHA.parse(context);
        else if (ruleName.equalsIgnoreCase("DIGIT")) rule = Rule_DIGIT.parse(context);
        else if (ruleName.equalsIgnoreCase("HEXDIG")) rule = Rule_HEXDIG.parse(context);
        else throw new IllegalArgumentException("unknown rule");

        if (rule == null) {
            throw new ParserException(
                    "rule \"" + context.getErrorStack().peek() + "\" failed",
                    context.text,
                    context.getErrorIndex(),
                    context.getErrorStack());
        }

        if (context.text.length() > context.index) {
            ParserException primaryError =
                    new ParserException(
                            "extra data found",
                            context.text,
                            context.index,
                            new Stack<>());

            if (context.getErrorIndex() > context.index) {
                ParserException secondaryError =
                        new ParserException(
                                "rule \"" + context.getErrorStack().peek() + "\" failed",
                                context.text,
                                context.getErrorIndex(),
                                context.getErrorStack());

                primaryError.initCause(secondaryError);
            }

            throw primaryError;
        }

        return rule;
    }

    public Rule parse(String ruleName, InputStream in) throws IllegalArgumentException, IOException, ParserException {
        if (ruleName == null)
            throw new IllegalArgumentException("null ruleName");
        if (in == null)
            throw new IllegalArgumentException("null input stream");

        int ch;
        StringBuilder out = new StringBuilder();
        while ((ch = in.read()) != -1)
            out.append((char) ch);

        return parse(ruleName, out.toString());
    }

    public Rule parse(String rulename, File file) throws IllegalArgumentException, IOException, ParserException {
        if (rulename == null)
            throw new IllegalArgumentException("null rulename");
        if (file == null)
            throw new IllegalArgumentException("null file");

        BufferedReader in = new BufferedReader(new FileReader(file));
        int ch;
        StringBuilder out = new StringBuilder();
        while ((ch = in.read()) != -1)
            out.append((char) ch);

        in.close();

        return parse(rulename, out.toString());
    }
}