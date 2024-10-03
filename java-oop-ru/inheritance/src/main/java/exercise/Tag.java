package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String  nameTag;
    private Map<String,String> tag;

    public Tag(String nameTag, Map<String, String> tag) {
        this.nameTag = nameTag;
        this.tag = tag;
    }

    public String getNameTag() {
        return nameTag;
    }

    public Map<String, String> getTag() {
        return tag;
    }




}
// END
