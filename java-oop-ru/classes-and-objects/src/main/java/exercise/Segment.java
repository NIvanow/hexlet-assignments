package exercise;

// BEGIN
public class Segment {
    private Point point1;
    private Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getBeginPoint() {
        return point1;
    }
    public Point getEndPoint() {
        return point2;
    }

    public Point getMidPoint() {
        Point midPoint = new Point(0, 0);
        int x = (point1.getX() + point2.getX()) / 2;
        int y = (point1.getY() + point2.getY()) / 2;
        midPoint.setX(x);
        midPoint.setY(y);
        return  midPoint;
    }
}
// END
