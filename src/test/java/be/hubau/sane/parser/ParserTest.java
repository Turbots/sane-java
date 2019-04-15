package be.hubau.sane.parser;

import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParserTest {

    @Test
    public void parseStandardExampleFile() throws IOException, ParserException {
        InputStream inputStream = ParserTest.class.getResourceAsStream("/example.sane");
        Parser parser = new Parser();
        Rule rule = parser.parse("sane", inputStream);

        assertEquals(23, rule.rules.size());
    }
}