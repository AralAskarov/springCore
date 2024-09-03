package com.loose.coupling;

public class UserDatebaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        // Directly access db here
        return "User Details from database";
    }
}
