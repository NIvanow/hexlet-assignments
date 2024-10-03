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
        var result = "<" + getNameTag() + " ";
        for (var i = 0; i < m.length; i++) {
            result += m[i] ;
            if (i % 2 == 0) {
                result+= "=";
            }
            if (i % 2 == 1 && (i+1)!=m.length) {
                result += "\" ";
            } else {
                result+="\"";
            }
        }
        result +=">";
        return result;

        } else {
            return "<" + getNameTag() + ">";
        }
    }
}
// END
