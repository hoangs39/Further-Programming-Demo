package com.rmit.Problem4;

public class FullTimeStudents extends ProfilesAPI{

    @Override
    public String getProfile() {
        String major = "FullTime Students";
        return this.profile + major;
    }

    @Override
    public void setProfile(String profile) {
       this.profile = profile;
    }
    
}
