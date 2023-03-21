package com.rmit.Problem1;
import com.rmit.Problem2.Human;
public abstract class Students extends Human {
    private String fullName;
    private int age;
    private String major;

    public Students(String fullName, String major, int age){
        this.age = age;
        this.fullName = fullName;
        this.major = major;
    }
    public int getAge() {
        return age;
    }
    public String getFullName() {
        return fullName;
    }
    public String getMajor() {
        return major;
    }
}
