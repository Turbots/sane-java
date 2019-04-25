package be.hubau.sane.parser;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaneSetTest {

    @Test
    void createSetAndCheckKeys() throws IOException, ParserException {
        SaneSet saneSet = new SaneSet(SaneSetTest.class.getResourceAsStream("/example.sane"));

        assertEquals("\"SANE Example\"", saneSet.getKeys().get("title"));
    }
}
