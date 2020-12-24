package com.design.patterns;

import com.design.patterns.structural.facade.CalculusFacadeImpl;
import com.design.patterns.structural.facade.CalculusService;
import com.design.patterns.structural.proxy.ProxyUserServiceImpl;
import com.design.patterns.structural.proxy.User;
import com.design.patterns.structural.proxy.UserService;

import java.util.List;

/**
    Design Patterns Examples

 */
public class Main {

    public static void main(String args[]){
        System.out.println("###################");
        System.out.println("Structural -> Facade");
        CalculusService calculusService = new CalculusService(new CalculusFacadeImpl());
        System.out.println("Triangle Area : " + calculusService.calculateTriangleArea("3", "10"));

        System.out.println("");
        System.out.println("Structural -> Proxy");
        UserService proxy = new ProxyUserServiceImpl();
        List<User> users = proxy.list();
        System.out.println(users);
    }

}