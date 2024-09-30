package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> values;

    public InMemoryKV(Map<String, String> values) {
        this.values = values;
    }
    @Override
    public void set(String key, String value) {
        HashMap date = new HashMap<String, String>(values);
        date.put(key, value);
        values = date;
    }

    @Override
    public void unset(String key) {
        HashMap date = new HashMap<String, String>(values);
        date.remove(key);
        values = date;
    }

    @Override
    public String get(String key, String defaultValue) {
        HashMap date = new HashMap<String, String>(values);
        return values.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        HashMap date = new HashMap<String, String>(values);
        return date;
    }
}
// END
