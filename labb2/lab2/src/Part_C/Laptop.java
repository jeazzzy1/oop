package Part_C;

import java.util.Objects;

public class Laptop extends Computer {
    private double screenSize;


    public Laptop(String brand, String model, double screenSize) {
        super(brand, model);
        this.screenSize = screenSize;
    }


    public double getScreenSize() {
        return screenSize;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o) && o instanceof Laptop) {
            Laptop laptop = (Laptop) o;
            return screenSize == laptop.screenSize;
        }
        return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), screenSize);
    }
}
