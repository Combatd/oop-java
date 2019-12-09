package com.davisallen;

public class SubstituteTeacher extends Teacher {
    private int daysLeftAsSub;

    public SubstituteTeacher(String firstName, String lastName, String preferredHonorific, int daysLeftAsSub) {
        super(firstName, lastName, preferredHonorific);
        this.daysLeftAsSub = daysLeftAsSub;
    }

    @Override
    public void greet() {
        System.out.println("Hi, I'm " + this.preferredHonorific + " " + this.firstName + "!");
    }
}
