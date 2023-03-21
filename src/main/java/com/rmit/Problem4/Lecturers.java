package com.rmit.Problem4;

public class Lecturers extends ProfilesAPI{

    @Override
    public String getProfile() {
        String major = "Lecturers";
        return this.profile + major;
    }

    @Override
    public void setProfile(String profile) {
       this.profile = profile;
    }
    
}
