package com.rmit.Problem1;

public class StudentsGroup {
    public Students[] students;
    static final int MAX_NUMBER = 10;
    public int counter;
    public StudentsGroup(){
        students = new Students[MAX_NUMBER];
        counter = 0;
    }
    public void addMember(Students student){
        students[counter++] = student;
    }
    public void addMember(FullTimeStudents fTStudent){
        students[counter++] = fTStudent;
    }
    public void addMember(PartTimeStudents pTStudent){
        students[counter++] = pTStudent;
    }

    public void displayAll(){
        for (int i = 0; i < counter; i++) {
            System.out.println(students[i].toString());
        }
    }
}
