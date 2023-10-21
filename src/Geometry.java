import java.util.Scanner;

public class Geometry {
    /*
     * Student: Rodrigo Olave Carrasco
     * Student ID: 898267
     *
     * Write a Geometry program that allows the user to create an array of at least three
     * triangles by entering the coordinates (x, y) of the vertices of a triangle. The program
     * then displays the perimeter of each triangle and a message indicating whether they are
     * an isosceles triangle. Your program must be object oriented and modular.
     *
     * indications:
     * - A triangle is isosceles if at least two sides have the same length.
     * - The formula for calculating the distance between two points (x1, y1) and (x2, y2)
     *   is: square root of (x1 – x2)2 + (y1 – y2)2.
     * - Java provides the Math.sqrt () method to calculate the square root. This method
     *   takes a non-negative number as a parameter.
     * Example:
     * double var = Math.sqrt(9.0);
     * Example of displaying the program for an isosceles triangle:
     * Construction of a new point Please enter x: 0 Please enter y: 0
     * Construction of a new point Please enter x: 2.5 Please enter y: 2.5
     * Construction of a new point Please enter x: 0 Please enter
     */

    static Scanner scanner = new Scanner(System.in);
    static private void createTriangles() {
        Triangle[] triangles;
        int MIN_TRIANGLE_QUANTITY = 3;
        int triangleQuantity;
        do {
            System.out.println("Please enter the number of triangles that you want to create.");
            triangleQuantity = scanner.nextInt();
            if (triangleQuantity < MIN_TRIANGLE_QUANTITY) {
                System.out.println("Please enter a number not less than 3.");
            }
        } while (triangleQuantity < MIN_TRIANGLE_QUANTITY);
        triangles = new Triangle[triangleQuantity];
        for (int i = 0; i < triangleQuantity; i++) {
            System.out.printf("Creating triangle %d.\n", i + 1);
            Point pointA, pointB, pointC;
            pointA = createPoint("A");
            do {
                pointB = createPoint("B");
            } while (pointB.isExistingPointCoordinates(pointA));
            do {
                pointC = createPoint("C");
            } while (pointC.isExistingPointCoordinates(pointA) && pointC.isExistingPointCoordinates(pointB));
            Triangle triangle = new Triangle(pointA, pointB, pointC);
            String isIsosceles = triangle.isTriangleIsosceles() ? "is isosceles." : "is not isosceles.";
            System.out.printf("Triangle distance side A = %.2f, side B %.2f, and side C %.2f.\n",
                    triangle.getDistanceA(), triangle.getDistanceB(), triangle.getDistanceC());
            System.out.printf("Triangle perimeter is %.2f.\n", triangle.getTrianglePerimeter());
            System.out.printf("Triangle %d %s.\n", i + 1, isIsosceles);
            triangles[i] = triangle;
        }
    }

    static private Point createPoint(String pointName) {
        Point point;
        double coordinateX, coordinateY;
        System.out.printf("Construction of a new point %s\n", pointName);
        coordinateX = createCoordinate("x");
        coordinateY = createCoordinate("y");
        point = new Point(coordinateX, coordinateY);
        return point;
    }

    static private double createCoordinate(String coordinateName) {
        double coordinate;
        do {
            System.out.printf("Construction of a new point Please enter %s: ", coordinateName);
            coordinate = scanner.nextDouble();
        } while (coordinate < 0);
        return coordinate;
    }

    public static void main(String[] args) {
        createTriangles();
    }
}