package be.hubau.sane.parser

import mu.KotlinLogging
import java.util.*

class ParserContext(val text: String) {
    private val logger = KotlinLogging.logger {}

    var index: Int = 0

    private val startStack = Stack<Int>()
    private val callStack = Stack<String>()
    var errorStack = Stack<String>()
        private set
    private var level = 0
    var errorIndex = 0
        private set

    init {
        this.index = 0
    }

    @JvmOverloads
    fun push(rulename: String, trace: String? = "") {
        this.callStack.push(rulename)
        this.startStack.push(this.index)

        logger.debug("-> " + ++this.level + ": " + rulename + "(" + (trace ?: "") + ")")
        logger.debug(this.index.toString() + ": " + this.text.substring(this.index, if (this.index + 10 > this.text.length) this.text.length else this.index + 10).replace("[\\x00-\\x1F]".toRegex(), " "))
    }

    fun pop(function: String, result: Boolean) {
        val start = this.startStack.pop()
        this.callStack.pop()

        logger.debug("<- " + this.level-- +
                ": " + function +
                "(" + (if (result) "true" else "false") +
                ",s=" + start +
                ",l=" + (this.index - start!!) +
                ",e=" + this.errorIndex + ")")

        if (!result) {
            if (this.index > this.errorIndex) {
                this.errorIndex = this.index
                this.errorStack = Stack()
                this.errorStack.addAll(this.callStack)
            } else if (this.index == this.errorIndex && this.errorStack.isEmpty()) {
                this.errorStack = Stack()
                this.errorStack.addAll(this.callStack)
            }
        } else {
            if (this.index > this.errorIndex) this.errorIndex = 0
        }
    }
}