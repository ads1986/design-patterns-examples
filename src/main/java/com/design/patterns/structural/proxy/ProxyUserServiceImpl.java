package com.design.patterns.structural.proxy;

import java.util.List;

public class ProxyUserServiceImpl implements UserService {

    private UserService service;

    @Override
    public List<User> list() {
        System.out.println("1. Calling ProxyUser");
        System.out.println("2. Instantiate UserServiceImpl");
        UserService service = new UserServiceImpl();
        return service.list();
    }
}