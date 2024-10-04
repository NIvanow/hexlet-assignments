package exercise;

// BEGIN
public class App {
    private Circle circle;

    public App(Circle circle) {
        this.circle = circle;
    }

    public Circle getCircle() {
        return circle;
    }

    public static void printSquare(Circle circle) {
        try {
            System.out.println(Math.round(circle.getSquare()) + "\nВычисление окончено");
        } catch(Exception exception) {
            System.out.println("Не удалось посчитать площадь\nВычисление окончено");
        }
    }

}
// END
