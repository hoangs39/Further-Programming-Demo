package com.rmit.Problem1;

public class FullTimeStudents extends Students{

    public FullTimeStudents(String fullName, String major, int age) {
        super(fullName, major, age);
    }

    public String toString() {
        return String.format("Part-Time Students: Name: %s, Age: %d, Major: %s", getFullName(),getAge(),getMajor());
    }
    
}
