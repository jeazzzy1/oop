package lab2.com;

public class Cube extends Shape3D {
    private double sideLength;
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double volume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * sideLength * sideLength;
    }
}
