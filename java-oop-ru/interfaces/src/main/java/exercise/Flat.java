package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconArea;
    private int floor;

    public int getFloor() {
        return floor;
    }

    public double getBalconArea() {
        return balconArea;
    }

    Flat(double area, double balconArea, int floor) {
        this.area = area;
        this.balconArea = balconArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balconArea;
    }

    @Override
    public int compareTo(Home another) {
        if (getArea() == another.getArea()) {
            return 0;
        }
        return getArea() > another.getArea() ? 1 : -1;
    }

    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }

}
// END
