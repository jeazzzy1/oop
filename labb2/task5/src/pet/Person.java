package pet;

import java.util.Objects;
import java.util.ArrayList;

public abstract class Person {
    private String name;
    private int age;
    protected ArrayList<Animal> animals = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        assignPet(animal);
    }

    public boolean hasPet() {
        return !animals.isEmpty();
    }

    public void assignPet(Animal animal) {
        animals.add(animal);
    }

    public void removePet(Animal animal) {
        animals.remove(animal);
    }

    public void leavePetWith(Person person) {
        if (!hasPet()) {
            System.out.println(name + " does not have any pets.");
            return;
        }
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("PhD students cannot take care of dogs!");
                return;
            }
        }

        person.animals.addAll(this.animals);
        this.animals.clear();
        System.out.println("Pets successfully transferred to " + person.name);
    }

    public void retrievePetFrom(Person person) {
        if (person.animals.isEmpty()) {
            System.out.println(person.name + " does not have any pets.");
            return;
        }
        this.animals.addAll(person.animals);
        person.animals.clear();
        System.out.println("Pets successfully retrieved from " + person.name);
    }

    @Override
    public String toString() {
        String petInfo = animals.isEmpty() ? "no pets" : animals.toString();
        return "Person [name= " + name + ", age= " + age + ", animals=" + petInfo + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(animals, person.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, animals);
    }
}
