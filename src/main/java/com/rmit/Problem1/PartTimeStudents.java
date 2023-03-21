package com.rmit.Problem1;

public class PartTimeStudents extends Students{

    public PartTimeStudents(String fullName, String major, int age) {
        super(fullName, major, age);
    }
    @Override
    public String toString() {
        return String.format("Part-Time Students: Name: %s, Age: %d, Major: %s", getFullName(),getAge(),getMajor());
    }
    
}
