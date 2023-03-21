package com.rmit.Problem4;

public class Projects {
    private ProfilesAPI[] profilesAPIs;
    public static final int MAX_NUMBER = 10;
    private int counter;
    
    public Projects(){
        profilesAPIs = new ProfilesAPI[MAX_NUMBER];
        counter = 0;
    }
    public void addMember(ProfilesAPI profilesAPI){
        profilesAPIs[counter++] = profilesAPI;
    }
    public void showProfile(int i){
        profilesAPIs[i].getProfile();
    }
}
