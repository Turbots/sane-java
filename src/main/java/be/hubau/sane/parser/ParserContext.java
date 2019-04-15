package be.hubau.sane.parser;

import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParserContext {

    private static final Logger logger = LoggerFactory.getLogger(ParserContext.class);

    public final String text;
    public int index;
    private Stack<Integer> startStack = new Stack<>();
    private Stack<String> callStack = new Stack<>();
    private Stack<String> errorStack = new Stack<>();
    private int level = 0;
    private int errorIndex = 0;

    public ParserContext(String text) {
        this.text = text;
        this.index = 0;
    }

    public void push(String rulename) {
        push(rulename, "");
    }

    public void push(String rulename, String trace) {
        this.callStack.push(rulename);
        this.startStack.push(this.index);

        if (logger.isDebugEnabled()) {
            logger.debug("-> " + ++this.level + ": " + rulename + "(" + (trace != null ? trace : "") + ")");
            logger.debug(this.index + ": " + this.text.substring(this.index, this.index + 10 > this.text.length() ? this.text.length() : this.index + 10).replaceAll("[\\x00-\\x1F]", " "));
        }
    }

    public void pop(String function, boolean result) {
        Integer start = this.startStack.pop();
        this.callStack.pop();

        if (logger.isDebugEnabled()) {
            logger.debug(
                    "<- " + this.level-- +
                            ": " + function +
                            "(" + (result ? "true" : "false") +
                            ",s=" + start +
                            ",l=" + (this.index - start) +
                            ",e=" + this.errorIndex + ")");
        }

        if (!result) {
            if (this.index > this.errorIndex) {
                this.errorIndex = this.index;
                this.errorStack = new Stack<>();
                this.errorStack.addAll(this.callStack);
            } else if (this.index == this.errorIndex && this.errorStack.isEmpty()) {
                this.errorStack = new Stack<>();
                this.errorStack.addAll(this.callStack);
            }
        } else {
            if (this.index > this.errorIndex) this.errorIndex = 0;
        }
    }

    Stack<String> getErrorStack() {
        return this.errorStack;
    }

    int getErrorIndex() {
        return this.errorIndex;
    }
}