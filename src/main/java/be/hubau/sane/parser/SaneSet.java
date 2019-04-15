package be.hubau.sane.parser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaneSet {

    private final Map<String, Object> keys;

    public SaneSet(File file) throws IOException, ParserException {
        Parser parser = new Parser();
        Rule rule = parser.parse("sane", file);

        this.keys = processRules(null, rule.rules);
    }

    public SaneSet(InputStream inputStream) throws IOException, ParserException {
        Parser parser = new Parser();
        Rule rule = parser.parse("sane", inputStream);

        this.keys = processRules(null, rule.rules);
    }

    private Map<String, Object> processRules(String key, List<Rule> rules) {
        Map<String, Object> keys = new HashMap<>();
        rules.forEach(rule -> {
            if (rule instanceof Rule_expression) {
                keys.putAll(processRules(null, rule.rules));
            }
            if (rule instanceof Rule_keyval || rule instanceof Rule_map_pair) {
                String childKey = rule.rules.get(0).spelling;
                Rule value = rule.rules.get(2).rules.get(0);
                if (value instanceof Rule_string) {
                    keys.put(childKey, value.rules.get(0).spelling);
                } else {
                    keys.put(childKey, processRules(childKey, value.rules));
                }
            }
            if (rule instanceof Rule_map_keyvals) {
                keys.putAll(processRules(key, rule.rules));
            }
            if (rule instanceof Rule_list) {
                keys.put(key, new ArrayList<>());
            }
        });

        return keys;
    }

    public Map<String, Object> getKeys() {
        return this.keys;
    }
}
