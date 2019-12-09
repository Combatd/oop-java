package com.davisallen;

public abstract class Person {
    protected String firstName;
    protected String lastName;

    public abstract void greet();

    public void register(Enrollable group) {
        group.enroll(this);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
