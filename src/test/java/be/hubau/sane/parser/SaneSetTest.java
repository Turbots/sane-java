package be.hubau.sane.parser;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class SaneSetTest {

    @Test
    void createSetAndCheckKeys() throws IOException, ParserException {
        SaneSet saneSet = new SaneSet(SaneSetTest.class.getResourceAsStream("/example.sane"));

        System.out.println(saneSet.getKeys());
    }
}
