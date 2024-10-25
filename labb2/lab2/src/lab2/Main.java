package lab2.com;

public class Main {
    public static void main(String[] args) {
        Shape3D cylinder = new Cylinder(5, 10);
        Shape3D sphere = new Sphere(7);
        Shape3D cube = new Cube(4);

        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());
        System.out.println("Sphere Volume: " + sphere.volume());
        System.out.println("Sphere Surface Area: " + sphere.surfaceArea());
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.surfaceArea());
    }
}
