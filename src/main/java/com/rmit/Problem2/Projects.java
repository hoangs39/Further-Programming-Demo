package com.rmit.Problem2;

import com.rmit.Problem1.FullTimeStudents;

public class Projects {
    private int rank;
    private String name;
    private String projectID;
    private Lecturers leader;
    private Human[] humans;
    private Object[] objs;
    private FullTimeStudents[] fTStudents;
    private Lecturers[] lecturers;
    public static final int MAX_NUMBER = 5;
    private int counter1;
    private int counter2;
    private int counter3;


    public Projects(String name,String projectID, int rank){
        this.projectID = projectID;
        this.name = name;
        this.rank = rank;
        humans = new Human[this.MAX_NUMBER];
        lecturers = new Lecturers[this.MAX_NUMBER];
        fTStudents = new FullTimeStudents[this.MAX_NUMBER];
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;
    }
    
    public void addMember(FullTimeStudents fStudent){
        fTStudents[counter2++] = fStudent;
    }

    public void addMember(Lecturers lecturer){
        lecturers[counter3++] = lecturer;
    }

    public void addMember(Human human){
        humans[counter1++] = human;
    }
    public void addMember(Object obj){
        // objs[counter1++] = obj;
        if(obj instanceof FullTimeStudents){
            objs[counter1++] = (FullTimeStudents) obj;
        }
        if(obj instanceof Lecturers){
            objs[counter1++] = (Lecturers) obj;
        }
    }
    
    

}
