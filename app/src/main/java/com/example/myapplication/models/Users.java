package com.example.myapplication.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public String username;
    public String password;
    public static Boolean passwordIsValid(String Users, String Password){
        for (Users i:getUsers()) {
            if (i.username.equals(Users)){
                if (i.password.equals(Password)){
                    return true;
                }
            }
        }
        return false;
    }
    public  static ArrayList<Users> getUsers(){
        ArrayList<Users> list = new ArrayList<Users>();
        Users o = new Users();
        o.username = "bichito";
        o.password = "123456";
        list.add(o);
        Users t = new Users();
        t.username = "panchita";
        t.password = "1234567";
        list.add(t);

        return list;

    }
}


