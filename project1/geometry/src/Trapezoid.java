// Define the Trapezoid class
public class Trapezoid extends Quadrilateral {
    public Trapezoid(Point[] points) {
        super(points);
    }

    @Override
    public double calculateArea() {
        int base1 = Math.abs(points[0].x - points[1].x);
        int base2 = Math.abs(points[2].x - points[3].x);
        int height = Math.abs(points[0].y - points[2].y);

        return 0.5 * (base1 + base2) * height;
    }
}