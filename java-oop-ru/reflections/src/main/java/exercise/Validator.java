package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    private List<String> nameFiedlsWithNull;

    public Validator(List<String> nameFiedlsWithNull) {
        this.nameFiedlsWithNull = nameFiedlsWithNull;
    }

    public List<String> getNameFiedlsWithNull() {
        return nameFiedlsWithNull;
    }

    public static List<String> validate(Address address) {
        List<String> result = new ArrayList<>();
        Class<?> aClass = address.getClass();
        try {
            Field[] fields = aClass.getDeclaredFields();
            for (var field : fields) {
                if (field.isAnnotationPresent(NotNull.class)) {
                    field.setAccessible(true);
                    var pp = field.get(address);
                    if (pp == null) {
                        result.add(field.getName());
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }
}
// END
