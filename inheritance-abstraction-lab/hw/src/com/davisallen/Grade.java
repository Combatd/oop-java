package com.davisallen;

import java.util.ArrayList;

public class Grade implements Enrollable {
    private ArrayList<Student> roster;
    private int grade;

    public Grade(int grade) {
        this.roster = new ArrayList<Student>();
        this.grade = 1;
        this.setGrade(grade);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <=12) {
            this.grade = grade;
        } else {
            System.out.println("This school is only grades 1 through 12.");
            System.out.println("This grade will remain as " + this.grade);
        }
    }

    public void enroll(Person person) {
        if (person instanceof Teacher) {
            System.out.println("You can't enroll a teacher in this grade! Students only!");
        } else if (person instanceof Student) {
            ((Student) person).setGrade(this.grade);
            this.roster.add((Student)person);
        } else {
            System.out.println("Don't know how to handle person of type" + person.getClass());
        }
    }

    public void printStudents() {
        System.out.println("\n------------");
        System.out.println("Grade " + this.grade + ":");
        for (Student student : this.roster) {
            System.out.println(student.getFullName());
        }
        System.out.println("------------\n");
    }
}
