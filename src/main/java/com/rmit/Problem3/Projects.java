package com.rmit.Problem3;

public class Projects {
    private CanJoinProject[] canJoinProjects;
    public static final int MAX_NUMBER = 10;
    private int counter;
    
    public Projects(){
        canJoinProjects = new CanJoinProject[MAX_NUMBER];
        counter = 0;
    }
    public void addMember(CanJoinProject canJoinProject){
        canJoinProjects[counter++] = canJoinProject;
    }
}
