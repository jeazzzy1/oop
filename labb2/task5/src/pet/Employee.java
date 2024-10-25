package pet;

import java.util.Objects;

public class Employee extends Person {
    private String job;
    private double salary;

    public Employee(String name, int age, String job, double salary) {
        super(name, age);
        this.job = job;
        this.salary = salary;
    }

    public String getOccupation() {
        return "Employee: " + job;
    }

    @Override
    public String toString() {
        return super.toString() + ", job=" + job + ", salary=" + salary;
    }
}
