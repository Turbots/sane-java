package be.hubau.sane.parser;

import java.util.Stack;

/**
 * <p>Signals that a parse failure has occurred.</p>
 *
 * <p>Producer : com.parse2.aparse.Parser 2.5<br/>
 * Produced : Mon Apr 15 15:26:09 CEST 2019</p>
 */

public class ParserException extends Exception {
    static final private String newline = System.getProperty("line.separator", "\n");
    private String reason;
    private String text60;
    private int index60;
    private Stack<String> ruleStack;

    /**
     * Creates a parser exception from the specified parse failure information.
     *
     * @param reason    A description of the parse failure.
     * @param text      The string of characters being parsed.
     * @param index     The index to the character at which the parse failure occurred.
     * @param ruleStack The ABNF rule stack at the point the parse failure occurred.
     */

    public ParserException(String reason, String text, int index, Stack<String> ruleStack) {
        this.reason = reason;
        this.ruleStack = ruleStack;

        int start = (index < 30) ? 0 : index - 30;
        int end = (text.length() < index + 30) ? text.length() : index + 30;
        this.text60 = text.substring(start, end).replaceAll("[\\x00-\\x1F]", " ");
        this.index60 = (index < 30) ? index : 30;
    }

    public String getSubstring() {
        return this.text60;
    }

    public String getMessage() {
        String marker = "                              ";

        StringBuilder buffer = new StringBuilder();
        buffer.append(this.reason).append(newline);
        buffer.append(this.text60).append(newline);
        buffer.append(marker, 0, this.index60).append("^").append(newline);

        if (!this.ruleStack.empty()) {
            buffer.append("rule stack:");

            for (String rule : this.ruleStack)
                buffer.append(newline).append("  ").append(rule);
        }

        ParserException secondaryError = (ParserException) getCause();
        if (secondaryError != null) {
            buffer.append("possible cause: ").append(secondaryError.reason).append(newline);
            buffer.append(secondaryError.text60).append(newline);
            buffer.append(marker.substring(0, secondaryError.index60)).append("^").append(newline);

            if (!secondaryError.ruleStack.empty()) {
                buffer.append("rule stack:");

                for (String rule : secondaryError.ruleStack)
                    buffer.append(newline).append("  ").append(rule);
            }
        }

        return buffer.toString();
    }
}