package exercise;

import lombok.SneakyThrows;

import java.nio.file.Path;
import java.nio.file.Files;


// BEGIN
public class App {
    @SneakyThrows
    public static void save(Path path, Car car) {
        String seralCar = Car.serialized(car);
        Files.writeString(path, seralCar);

    }
    @SneakyThrows
    public static Car extract(Path path) {
        String f = Files.readString(path);
        Car car = Car.deserialize(f);
        return car;
    }
}
// END
