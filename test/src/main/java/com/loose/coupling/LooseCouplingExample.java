package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseprovider = new UserDatebaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseprovider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider database2 = new UserDataScale();
        UserManager userManagerWithDBSCale = new UserManager(database2);
        System.out.println(userManagerWithDBSCale.getUserInfo());
    }
}
