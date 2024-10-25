package Part_C;

import java.util.Objects;

public class Computer {
    private String brand;
    private String model;


    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    public String getBrand() {

        return brand;
    }

    public String getModel() {
        return model;
    }



    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


    public boolean equals(Object o) {
        if (o instanceof Computer) {
            Computer computer = (Computer) o;
            return Objects.equals(brand, computer.brand) &&
                    Objects.equals(model, computer.model);
        }
        return false;
    }


    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
