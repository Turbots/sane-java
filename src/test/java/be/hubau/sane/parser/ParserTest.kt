package be.hubau.sane.parser

import org.junit.jupiter.api.Test
import java.io.InputStream

class ParserTest {

    @Test
    fun parseStandardExampleFile() {
        val inputStream: InputStream = this.javaClass.getResourceAsStream("/example.sane")
        val parser = Parser
        val rule: Rule = parser.parse(ruleName = "sane", inputStream = inputStream)

        print("Spelling: ${rule.spelling}")
    }
}