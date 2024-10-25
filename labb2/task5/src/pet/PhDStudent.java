package pet;

import java.util.Objects;

public class PhDStudent extends Person {
    private String university;
    private String speciality;

    public PhDStudent(String name, int age, String university, String speciality) {
        super(name, age);
        this.university = university;
        this.speciality = speciality;
    }

    public String getOccupation() {
        return "PhD Student in " + university + ", specialization in " + speciality;
    }
    @Override
    public String toString() {
        return super.toString() + ", university=" + university + ", speciality=" + speciality;
    }
}
