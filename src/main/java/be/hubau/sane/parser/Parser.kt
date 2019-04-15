package be.hubau.sane.parser

import java.io.*
import java.util.*

object Parser {

    @JvmStatic
    fun main(args: Array<String>) {
        val arguments = Properties()
        var error = ""
        var ok = args.isNotEmpty()

        if (ok) {
            arguments.setProperty("Trace", "Off")
            arguments.setProperty("be.hubau.sane.parser.Rule", "newline")

            var i = 0
            while (i < args.size) {
                when {
                    args[i] == "-trace" -> arguments.setProperty("Trace", "On")
                    args[i] == "-visitor" -> arguments.setProperty("be.hubau.sane.parser.Visitor", args[++i])
                    args[i] == "-file" -> arguments.setProperty("File", args[++i])
                    args[i] == "-string" -> arguments.setProperty("String", args[++i])
                    args[i] == "-rule" -> arguments.setProperty("be.hubau.sane.parser.Rule", args[++i])
                    else -> {
                        error = "unknown argument: " + args[i]
                        ok = false
                    }
                }
                i++
            }
        }

        if (ok) {
            if (arguments.getProperty("File") == null && arguments.getProperty("String") == null) {
                error = "insufficient arguments: -file or -string required"
                ok = false
            }
        }

        if (ok) {
            try {
                var rule: Rule? = null

                if (arguments.getProperty("File") != null) {
                    rule = parse(
                            ruleName = arguments.getProperty("be.hubau.sane.parser.Rule"),
                            file = File(arguments.getProperty("File")))
                } else if (arguments.getProperty("String") != null) {
                    rule = this.parse(
                            ruleName = arguments.getProperty("be.hubau.sane.parser.Rule"),
                            string = arguments.getProperty("String"))
                }

                if (arguments.getProperty("be.hubau.sane.parser.Visitor") != null) {
                    val visitor = Class.forName(arguments.getProperty("be.hubau.sane.parser.Visitor")).newInstance() as Visitor
                    rule!!.accept(visitor)
                }
            } catch (e: IllegalArgumentException) {
                println("argument error: " + e.message)
            } catch (e: IOException) {
                println("io error: " + e.message)
            } catch (e: ParserException) {
                println("parser error: " + e.message)
            } catch (e: ClassNotFoundException) {
                println("visitor error: class not found - " + e.message)
            } catch (e: IllegalAccessException) {
                println("visitor error: illegal access - " + e.message)
            } catch (e: InstantiationException) {
                println("visitor error: instantiation failure - " + e.message)
            }

        } else {
            println("error: $error")
            println("usage: be.hubau.sane.parser.Parser [-rule rulename] [-trace] <-file file | -string string> [-visitor visitor]")
        }
    }

    @Throws(IllegalArgumentException::class, ParserException::class)
    fun parse(ruleName: String, string: String): Rule {
        val context = ParserContext(string)

        val rule: Rule?

        when {
            ruleName.equals("sane", ignoreCase = true) -> rule = Rule_sane.parse(context)
            ruleName.equals("expression", ignoreCase = true) -> rule = Rule_expression.parse(context)
            ruleName.equals("ws", ignoreCase = true) -> rule = Rule_ws.parse(context)
            ruleName.equals("newline", ignoreCase = true) -> rule = Rule_newline.parse(context)
            ruleName.equals("comment-start-symbol", ignoreCase = true) -> rule = Rule_comment_start_symbol.parse(context)
            ruleName.equals("non-eol", ignoreCase = true) -> rule = Rule_non_eol.parse(context)
            ruleName.equals("comment", ignoreCase = true) -> rule = Rule_comment.parse(context)
            ruleName.equals("keyval", ignoreCase = true) -> rule = Rule_keyval.parse(context)
            ruleName.equals("key", ignoreCase = true) -> rule = Rule_key.parse(context)
            ruleName.equals("simple-key", ignoreCase = true) -> rule = Rule_simple_key.parse(context)
            ruleName.equals("unquoted-key", ignoreCase = true) -> rule = Rule_unquoted_key.parse(context)
            ruleName.equals("quoted-key", ignoreCase = true) -> rule = Rule_quoted_key.parse(context)
            ruleName.equals("dotted-key", ignoreCase = true) -> rule = Rule_dotted_key.parse(context)
            ruleName.equals("dot-sep", ignoreCase = true) -> rule = Rule_dot_sep.parse(context)
            ruleName.equals("keyval-sep", ignoreCase = true) -> rule = Rule_keyval_sep.parse(context)
            ruleName.equals("val", ignoreCase = true) -> rule = Rule_val.parse(context)
            ruleName.equals("string", ignoreCase = true) -> rule = Rule_string.parse(context)
            ruleName.equals("basic-string", ignoreCase = true) -> rule = Rule_basic_string.parse(context)
            ruleName.equals("quotation-mark", ignoreCase = true) -> rule = Rule_quotation_mark.parse(context)
            ruleName.equals("basic-char", ignoreCase = true) -> rule = Rule_basic_char.parse(context)
            ruleName.equals("basic-unescaped", ignoreCase = true) -> rule = Rule_basic_unescaped.parse(context)
            ruleName.equals("escaped", ignoreCase = true) -> rule = Rule_escaped.parse(context)
            ruleName.equals("escape", ignoreCase = true) -> rule = Rule_escape.parse(context)
            ruleName.equals("escape-seq-char", ignoreCase = true) -> rule = Rule_escape_seq_char.parse(context)
            ruleName.equals("ml-basic-string", ignoreCase = true) -> rule = Rule_ml_basic_string.parse(context)
            ruleName.equals("ml-basic-string-delim", ignoreCase = true) -> rule = Rule_ml_basic_string_delim.parse(context)
            ruleName.equals("ml-basic-body", ignoreCase = true) -> rule = Rule_ml_basic_body.parse(context)
            ruleName.equals("ml-basic-char", ignoreCase = true) -> rule = Rule_ml_basic_char.parse(context)
            ruleName.equals("ml-basic-unescaped", ignoreCase = true) -> rule = Rule_ml_basic_unescaped.parse(context)
            ruleName.equals("literal-string", ignoreCase = true) -> rule = Rule_literal_string.parse(context)
            ruleName.equals("apostrophe", ignoreCase = true) -> rule = Rule_apostrophe.parse(context)
            ruleName.equals("literal-char", ignoreCase = true) -> rule = Rule_literal_char.parse(context)
            ruleName.equals("ml-literal-string", ignoreCase = true) -> rule = Rule_ml_literal_string.parse(context)
            ruleName.equals("ml-literal-string-delim", ignoreCase = true) -> rule = Rule_ml_literal_string_delim.parse(context)
            ruleName.equals("ml-literal-body", ignoreCase = true) -> rule = Rule_ml_literal_body.parse(context)
            ruleName.equals("ml-literal-char", ignoreCase = true) -> rule = Rule_ml_literal_char.parse(context)
            ruleName.equals("integer", ignoreCase = true) -> rule = Rule_integer.parse(context)
            ruleName.equals("minus", ignoreCase = true) -> rule = Rule_minus.parse(context)
            ruleName.equals("plus", ignoreCase = true) -> rule = Rule_plus.parse(context)
            ruleName.equals("underscore", ignoreCase = true) -> rule = Rule_underscore.parse(context)
            ruleName.equals("digit1-9", ignoreCase = true) -> rule = Rule_digit1_9.parse(context)
            ruleName.equals("digit0-7", ignoreCase = true) -> rule = Rule_digit0_7.parse(context)
            ruleName.equals("digit0-1", ignoreCase = true) -> rule = Rule_digit0_1.parse(context)
            ruleName.equals("hex-prefix", ignoreCase = true) -> rule = Rule_hex_prefix.parse(context)
            ruleName.equals("oct-prefix", ignoreCase = true) -> rule = Rule_oct_prefix.parse(context)
            ruleName.equals("bin-prefix", ignoreCase = true) -> rule = Rule_bin_prefix.parse(context)
            ruleName.equals("dec-int", ignoreCase = true) -> rule = Rule_dec_int.parse(context)
            ruleName.equals("unsigned-dec-int", ignoreCase = true) -> rule = Rule_unsigned_dec_int.parse(context)
            ruleName.equals("hex-int", ignoreCase = true) -> rule = Rule_hex_int.parse(context)
            ruleName.equals("oct-int", ignoreCase = true) -> rule = Rule_oct_int.parse(context)
            ruleName.equals("bin-int", ignoreCase = true) -> rule = Rule_bin_int.parse(context)
            ruleName.equals("float", ignoreCase = true) -> rule = Rule_float.parse(context)
            ruleName.equals("float-int-part", ignoreCase = true) -> rule = Rule_float_int_part.parse(context)
            ruleName.equals("frac", ignoreCase = true) -> rule = Rule_frac.parse(context)
            ruleName.equals("decimal-point", ignoreCase = true) -> rule = Rule_decimal_point.parse(context)
            ruleName.equals("zero-prefixable-int", ignoreCase = true) -> rule = Rule_zero_prefixable_int.parse(context)
            ruleName.equals("exp", ignoreCase = true) -> rule = Rule_exp.parse(context)
            ruleName.equals("special-float", ignoreCase = true) -> rule = Rule_special_float.parse(context)
            ruleName.equals("inf", ignoreCase = true) -> rule = Rule_inf.parse(context)
            ruleName.equals("nan", ignoreCase = true) -> rule = Rule_nan.parse(context)
            ruleName.equals("boolean", ignoreCase = true) -> rule = Rule_boolean.parse(context)
            ruleName.equals("true", ignoreCase = true) -> rule = Rule_true.parse(context)
            ruleName.equals("false", ignoreCase = true) -> rule = Rule_false.parse(context)
            ruleName.equals("list", ignoreCase = true) -> rule = Rule_list.parse(context)
            ruleName.equals("list-open", ignoreCase = true) -> rule = Rule_list_open.parse(context)
            ruleName.equals("list-close", ignoreCase = true) -> rule = Rule_list_close.parse(context)
            ruleName.equals("list-values", ignoreCase = true) -> rule = Rule_list_values.parse(context)
            ruleName.equals("list-sep", ignoreCase = true) -> rule = Rule_list_sep.parse(context)
            ruleName.equals("ws-comment-newline", ignoreCase = true) -> rule = Rule_ws_comment_newline.parse(context)
            ruleName.equals("map", ignoreCase = true) -> rule = Rule_map.parse(context)
            ruleName.equals("map-open", ignoreCase = true) -> rule = Rule_map_open.parse(context)
            ruleName.equals("map-close", ignoreCase = true) -> rule = Rule_map_close.parse(context)
            ruleName.equals("map-sep", ignoreCase = true) -> rule = Rule_map_sep.parse(context)
            ruleName.equals("map-pair", ignoreCase = true) -> rule = Rule_map_pair.parse(context)
            ruleName.equals("map-keyvals", ignoreCase = true) -> rule = Rule_map_keyvals.parse(context)
            ruleName.equals("ALPHA", ignoreCase = true) -> rule = Rule_ALPHA.parse(context)
            ruleName.equals("DIGIT", ignoreCase = true) -> rule = Rule_DIGIT.parse(context)
            ruleName.equals("HEXDIG", ignoreCase = true) -> rule = Rule_HEXDIG.parse(context)
            else -> throw IllegalArgumentException("unknown rule")
        }

        if (rule == null) {
            throw ParserException(
                    "rule \"" + context.errorStack.peek() as String + "\" failed",
                    context.text,
                    context.errorIndex,
                    context.errorStack)
        }

        if (context.text.length > context.index) {
            val primaryError = ParserException(
                    "extra data found",
                    context.text,
                    context.index,
                    Stack())

            if (context.errorIndex > context.index) {
                val secondaryError = ParserException(
                        "rule \"" + context.errorStack.peek() as String + "\" failed",
                        context.text,
                        context.errorIndex,
                        context.errorStack)

                primaryError.initCause(secondaryError)
            }

            throw primaryError
        }

        return rule
    }

    @Throws(IllegalArgumentException::class, IOException::class, ParserException::class)
    fun parse(ruleName: String, inputStream: InputStream): Rule {
        var ch: Int = inputStream.read()
        val out = StringBuffer()
        while (ch != -1) {
            ch = inputStream.read()
            out.append(ch.toChar())
        }

        return parse(ruleName, out.toString())
    }

    @Throws(IllegalArgumentException::class, IOException::class, ParserException::class)
    fun parse(ruleName: String, file: File): Rule {
        val inputStream = BufferedReader(FileReader(file))
        var ch: Int = inputStream.read()
        val out = StringBuffer()
        while (ch != -1) {
            ch = inputStream.read()
            out.append(ch.toChar())
        }

        inputStream.close()

        return parse(ruleName, out.toString())
    }
}