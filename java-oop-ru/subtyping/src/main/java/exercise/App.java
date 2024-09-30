package exercise;

import java.util.Map;
// BEGIN
public class App {
    KeyValueStorage st = new InMemoryKV(Map.of());
    public static void swapKeyValue(KeyValueStorage st) {
        var date = st.toMap();
        var entries = date.entrySet();
        var key = "";
        var value = "";
        for (var entry : entries) {
            key = entry.getKey();
            value = entry.getValue();
            st.unset(key);
            st.set(value, key);
        }
    }
}
// END
