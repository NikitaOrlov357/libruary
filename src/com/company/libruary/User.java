package com.company;

public class User {

    String userName;
    int userID;

    User(String userName, int userID){
        this.userName = userName;
        this.userID = userID;
    }

    public void printUser( int userID){
        System.out.println(userName + userID);
    }
}
