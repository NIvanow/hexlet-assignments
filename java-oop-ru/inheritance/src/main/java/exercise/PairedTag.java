package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
public class PairedTag extends Tag {
    private String bodyTag;
    private List<Tag> childrenTag;

    public PairedTag(String nameTag, Map<String, String> tag, String bodyTag, List<Tag> childrenTag) {
        super(nameTag, tag);
        this.bodyTag = bodyTag;
        this.childrenTag = childrenTag;
    }

    public String getBodyTag() {
        return bodyTag;
    }

    public List<Tag> getChildrenTag() {
        return childrenTag;
    }

    public String toString() {
        var result1= "";
        var result2 = "";
        var result = "";
        if (!getTag().isEmpty()) {
            var values1 = getTag().entrySet();
            var str1 = "";
            for (var value1 : values1) {
                str1 += value1.getKey() + " " + value1.getValue() + " ";
            }
            var m = str1.split(" ");
            result1 = "<" + getNameTag() + " ";
            for (var i = 0; i < m.length; i++) {
                result1 += m[i];
                if (i % 2 == 0) {
                    result1 += "=";
                }
                if (i % 2 == 1 && (i + 1) != m.length) {
                    result1 += "\" ";
                } else {
                    result1 += "\"";
                }
            }
            result1 += ">";
        } else {
            result1 ="<" + getNameTag() + ">";
        }
            for (var childTag : childrenTag) {
                {
                    var values2 = childTag.getTag().entrySet();
                    var str2 = "";
                    for (var value2 : values2) {
                        str2 += value2.getKey() + " " + value2.getValue() + " ";
                    }
                    var n = str2.split(" ");
                    result2 += "<" + childTag.getNameTag() + " ";
                    for (var j = 0; j < n.length; j++) {
                        result2 += n[j];
                        if (j % 2 == 0) {
                            result2 += "=";
                        }
                        if (j % 2 == 1 && (j + 1) != n.length) {
                            result2 += "\" ";
                        } else {
                            result2 += "\"";
                        }
                    }
                    result2 += ">";
                }
            }
        result = result1 + getBodyTag() + result2 + "</" + getNameTag() + ">";
        return result;
    }

}
// END
