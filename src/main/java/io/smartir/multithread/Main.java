package io.smartir.multithread;

public class Main {
    public static void main(String[] args) {
        UpdateStudent student = new UpdateStudent(new Student("jimi", "shukurov", "5"));
        UpdateStudent student2 = new UpdateStudent(new Student("jimi2", "shukurov2", "5"));
        student.start();
        student2.start();
    }
}
