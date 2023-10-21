public class Point {
    private double coordinateX, coordinateY;

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public boolean isExistingPointCoordinates(Point pointToCompare) {
        double existingX = pointToCompare.getCoordinateX();
        double existingY = pointToCompare.getCoordinateX();
        return this.coordinateX == existingX && this.coordinateY == existingY;
    }

    public double getDistance(Point comparisonPoint) {
        return Math.sqrt(
                Math.pow(this.coordinateX - comparisonPoint.coordinateX, 2) + Math.pow(this.coordinateY - comparisonPoint.coordinateY, 2));
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
}
