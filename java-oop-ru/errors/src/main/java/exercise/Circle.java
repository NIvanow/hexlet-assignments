package exercise;

// BEGIN
public class Circle {
    private Point point;
    private int radius;
    private double PI = Math.PI;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("");
        }
        return PI * radius * radius;
    }
}
// END
