package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        ArrayList<String> result = new ArrayList<>();
        if (apartments.size() != 0) {
            List<Home> sorted = apartments.stream().sorted(Comparator.comparing(Home::getArea)).toList();

            for (int i = 0; i < n; i++) {
                result.add(sorted.get(i).toString());
            }
            return result;
        }
        return result;
    }
}
// END
