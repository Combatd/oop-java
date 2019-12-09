package com.davisallen;

import java.util.ArrayList;

public class Classroom implements Enrollable{
    private Teacher teacher;
    private ArrayList<Student> students;
    private int grade;

    public Classroom(Teacher teacher, int grade) {
        this.teacher = teacher;
        this.grade = grade;
        this.students = new ArrayList<Student>();
    }

    @Override
    public void enroll(Person person) {
        if (person instanceof Teacher) {
            this.teacher = (Teacher)person;
        } else if (person instanceof Student) {
            Student student = (Student)person;
            if (this.grade == student.getGrade()) {
                this.students.add((Student)person);
            } else {
                System.out.println("That student is not of the same grade as this classroom and thus cannot join1");
            }
        } else {
            System.out.println("Don't know how to handle person of type" + person.getClass());
        }
    }

    public void printStudents() {
        System.out.println("\n------------");
        System.out.println(this.teacher.getFullName() + "'s classroom:");
        for (Student student : this.students) {
            System.out.println(student.getFullName());
        }
        System.out.println("------------\n");
    }
}
