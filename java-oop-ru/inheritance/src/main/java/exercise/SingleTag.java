package exercise;

import java.util.Map;
// BEGIN
public class SingleTag extends Tag {

    public SingleTag(String nameTag, Map<String, String> tag) {
        super(nameTag, tag);
    }

    public String toString() {
        if (!getTag().isEmpty()) {
            var values = getTag().entrySet();
            var str = "";
            for (var value : values) {
                str += value.getKey() + " " + value.getValue() + " ";
            }
            var m = str.split(" ");
            var result = "<" + getNameTag() + " " + m[0] + "=\"" + m[1] + "\" "
                    + m[2] + "=\"" + m[3] + "\">";
            return result;
        } else {
            return "<" +getNameTag() + ">";
        }
    }
}
// END
