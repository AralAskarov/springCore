package com.tight.coupling;

public class UserManager {
    private UserDatebase userDatabase = new UserDatebase();
    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
