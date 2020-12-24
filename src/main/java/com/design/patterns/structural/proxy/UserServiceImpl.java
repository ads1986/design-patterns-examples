package com.design.patterns.structural.proxy;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserDao userDao = new UserDao();

    @Override
    public List<User> list() {
        System.out.println("3. Calling UserService list method.");
        return userDao.list();
    }
}
