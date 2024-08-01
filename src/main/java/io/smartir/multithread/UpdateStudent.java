package io.smartir.multithread;

public class UpdateStudent extends Thread {
    private final Student student;

    public UpdateStudent(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        System.out.println(student.toString());
    }
}
