package com.davisallen;

public class Student extends Person {
    private int grade;

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        System.out.println("Registering this student as being of grade " + grade + ", but you should make sure to officially enroll them in that grade!");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void greet() {
        System.out.println("Hi, I'm " + this.firstName + ".");
    }
}
