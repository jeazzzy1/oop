package pet;

public class Student extends Person {
    private String university;
    private int course;

    public Student(String name, int age, Animal animal, String university, int course) {
        super(name, age, animal);
        this.university = university;
        this.course = course;
    }

    public Student(String name, int age, String university, int course) {
        super(name, age);
        this.university = university;
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + ", University: " + university + ", Course: " + course;
    }
}
