package com.lora.bournonvillesflow;

import android.content.Context;

/**
 * Created by Lotte on 03-01-2016.
 */
public class User {
    String name,userName,password;

    public User(String userName, String password){

        this.userName = userName;
        this.password = password;
        this.name =" ";

    }
    public User(String name,String userName,String password){
        this.userName = userName;
        this.password = password;
        this.name = name;

    }
    public void storeUser(User user){


    }

}
