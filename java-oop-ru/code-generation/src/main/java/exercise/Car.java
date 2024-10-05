package exercise;

import lombok.SneakyThrows;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    @SneakyThrows
    public static String serialized(Car car) {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String result = mapper.writeValueAsString(car);
        return result;
    }

    @SneakyThrows
    public static Car deserialize(String mapper) {
        Car car = new ObjectMapper().readValue(mapper, Car.class);
        return car;
    }
    // END
}
