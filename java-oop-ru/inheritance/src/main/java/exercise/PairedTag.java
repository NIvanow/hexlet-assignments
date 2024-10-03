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
        if (!getTag().isEmpty()) {
            var values = getTag().entrySet();
            var str = "";
            for (var value : values) {
                str += value.getKey() + " " + value.getValue() + " ";
            }
            var m = str.split(" ");
            var result = "<" + getNameTag() + " " + m[0] + "=\"" + m[1] + "\" "
                    + m[2] + "=\"" + m[3] + ">";
            return result;
        } else {
            return "<" +getNameTag() + ">";
        }
    }
}
// END
