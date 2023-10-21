public class Triangle {
    private Point pointA, pointB, pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public double getTrianglePerimeter() {
        return this.getDistanceA() + this.getDistanceB() + this.getDistanceC();
    }

    public boolean isTriangleIsosceles() {
        double distanceA = this.getDistanceA();
        double distanceB = this.getDistanceB();
        double distanceC = this.getDistanceC();
        return distanceA == distanceB || distanceB == distanceC || distanceC == distanceA;
    }

    public double getDistanceA() {
        return this.pointA.getDistance(this.pointB);
    }

    public double getDistanceB() {
        return this.pointB.getDistance(this.pointC);
    }

    public double getDistanceC() {
        return this.pointC.getDistance(this.pointA);
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
