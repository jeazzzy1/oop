package pet;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void getSound();

    @Override
    public String toString() {
        return name + " (" + getClass().getSimpleName() + "), age: " + age;
    }
}
