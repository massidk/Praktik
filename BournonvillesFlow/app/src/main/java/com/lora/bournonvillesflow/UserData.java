package com.lora.bournonvillesflow;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Lotte on 03-01-2016.
 */
public class UserData {

    public final static String DATANAME = "userDetails";
    SharedPreferences userDatabase;

    public UserData(Context context)
    {
        userDatabase = context.getSharedPreferences(DATANAME,0);
    }
    public void storeUserData(User user){
        SharedPreferences.Editor dataEditor = userDatabase.edit();
        dataEditor.putString("username",user.userName);
        dataEditor.putString("name",user.name);
        dataEditor.putString("password",user.password);
        dataEditor.commit();
    }
    public User getUserLoggedIn(){
        String name = userDatabase.getString("name", "");
        String username = userDatabase.getString("userName","");
        String password = userDatabase.getString("password","");

        User storedUser = new User(name,username,password);
        return storedUser;
    }
    public void setUserLoggedOn(boolean loggedOn){
      SharedPreferences.Editor dataEditor = userDatabase.edit();
        dataEditor.putBoolean("loggedOn", loggedOn);
        dataEditor.commit();

    }
    public void clearUserData(){
        SharedPreferences.Editor dataEditor = userDatabase.edit();
        dataEditor.clear();
        dataEditor.commit();
    }
}
