// Define the Parallelogram class
public class Parallelogram extends Quadrilateral {
    public Parallelogram(Point[] points) {
        super(points);
    }

    @Override
    public double calculateArea() {
        int base = Math.abs(points[0].x - points[1].x);
        int height = Math.abs(points[0].y - points[2].y);

        return base * height;
    }
}