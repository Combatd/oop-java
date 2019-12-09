package com.davisallen;

public class Main {

    public static void main(String[] args) {

        Teacher hull = new Teacher("Mary", "Hull", "Mrs.");

        Grade grade7 = new Grade(7);

        Student nickles = new Student("John", "Nickles", 6);
        Student stein = new Student("Rachel", "Stein", 6);

        grade7.printStudents();
        nickles.register(grade7);
        stein.register(grade7);
        grade7.printStudents();

        Classroom a2 = new Classroom(hull, 7);
        nickles.register(a2);
        stein.register(a2);
        a2.printStudents();

        Course algebra = new Course("Algebra");

        algebra.enroll(hull);
        algebra.enroll(nickles);
        algebra.enroll(stein);
        algebra.printClassInfo();

        SubstituteTeacher smith = new SubstituteTeacher("Jimmy", "Smith", "Mr.", 5);
        smith.register(algebra);
    }
}
