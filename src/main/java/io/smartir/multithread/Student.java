package io.smartir.multithread;

final public class Student {
    private final String name;
    private final String surname;
    private final String grade;

    public Student(String name, String surname, String grade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
