package com.design.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> list(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Paul", 35));
        users.add(new User(2, "Carl", 40));
        users.add(new User(3, "Jhon", 25));
        return users;
    }

}