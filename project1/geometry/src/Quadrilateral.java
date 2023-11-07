// Define the Quadrilateral class
public class Quadrilateral implements Shape {
    Point[] points;
    double density = 1;

    public Quadrilateral(Point[] points) {
        this.points = points;
    }

    @Override
    public double calculateArea() {
        int x1 = points[0].x;
        int y1 = points[0].y;
        int x2 = points[1].x;
        int y2 = points[1].y;

        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    @Override
    public double calculateMass() {
        return calculateArea() * density;
    }
}