package com.ioc.loose.coupling;

public class UserDataScale implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User Details from bd bus its easy to scale";
    }
}
