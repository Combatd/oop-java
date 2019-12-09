package com.davisallen;

import java.util.ArrayList;

public class Course implements Enrollable {
    private ArrayList<Student> roster;
    private Teacher teacher;
    private SubstituteTeacher tempTeacher;
    private String name;

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.roster = new ArrayList<Student>();
        this.tempTeacher = null;
    }

    public Course(String name) {
        this(name, null);
    }

    public void enroll(Person person) {
        if (person instanceof SubstituteTeacher) {
            this.tempTeacher = (SubstituteTeacher)person;
        } else if (person instanceof Teacher) {
            this.teacher = (Teacher)person;
        } else if (person instanceof Student) {
            this.roster.add((Student)person);
        } else {
            System.out.println("Don't know how to handle person of type" + person.getClass());
        }
    }

    public void printClassInfo() {
        System.out.println("\n------------");
        System.out.println("Class: " + this.name + "\n");
        if (this.teacher != null) {
            System.out.println("Teacher: " + this.teacher.getFullName());
        } else {
            System.out.println("No teacher assigned to this class yet");
        }
        System.out.println("\nStudents:");
        for (Student student : this.roster) {
            System.out.println(student.getFullName());
        }
        System.out.println("------------\n");
    }
}
