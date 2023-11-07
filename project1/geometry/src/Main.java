import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays for each shape
        Shape[] trapezoids = new Trapezoid[10];
        Shape[] parallelograms = new Parallelogram[10];
        Shape[] rectangles = new Rectangle[10];
        Shape[] squares = new Square[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the shape you want to define (Trapezoid, Parallelogram, Rectangle, Square):");
            String shapeType = scanner.nextLine();

            System.out.println("Enter the coordinates of the 4 points (x1 y1 x2 y2 x3 y3 x4 y4):");
            String[] coordinates = scanner.nextLine().split(" ");
            if (coordinates.length != 8) {
                System.out.println("Invalid input. Please provide 8 coordinates.");
                i--;
                continue;
            }
            Point[] points = new Point[4];
            for (int j = 0; j < 4; j++) {
                int x = Integer.parseInt(coordinates[j * 2]);
                int y = Integer.parseInt(coordinates[j * 2 + 1]);
                points[j] = new Point(x, y);
            }

            switch (shapeType) {
                case "Trapezoid":
                    trapezoids[i] = new Trapezoid(points);
                    break;
                case "Parallelogram":
                    parallelograms[i] = new Parallelogram(points);
                    break;
                case "Rectangle":
                    rectangles[i] = new Rectangle(points);
                    break;
                case "Square":
                    squares[i] = new Square(points);
                    break;
                default:
                    System.out.println("Invalid shape type. Please try again.");
                    i--;
                    break;
            }
        }

        scanner.close();

        // Calculate and display areas
        for (Shape shape : trapezoids) {
            if (shape != null) {
                System.out.println("Trapezoid Area: " + shape.calculateArea());
                System.out.println("Trapezoid Mass: " + shape.calculateMass());
            }
        }

        for (Shape shape : parallelograms) {
            if (shape != null) {
                System.out.println("Parallelogram Area: " + shape.calculateArea());
                System.out.println("Parallelogram Mass: " + shape.calculateMass());
            }
        }

        for (Shape shape : rectangles) {
            if (shape != null) {
                System.out.println("Rectangle Area: " + shape.calculateArea());
                System.out.println("Rectangle Mass: " + shape.calculateMass());
            }
        }

        for (Shape shape : squares) {
            if (shape != null) {
                System.out.println("Square Area: " + shape.calculateArea());
                System.out.println("Square Mass: " + shape.calculateMass());
            }
        }
    }
}