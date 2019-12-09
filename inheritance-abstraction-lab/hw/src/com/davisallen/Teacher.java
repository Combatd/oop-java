package com.davisallen;

public class Teacher extends Person {
    protected String preferredHonorific;

    public Teacher(String firstName, String lastName, String preferredHonorific) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.preferredHonorific = preferredHonorific;
    }

    public void greet() {
        System.out.println("Hi, I'm " + this.preferredHonorific + " " + this.lastName + ".");
    }
}
