package com.design.patterns.creational.singleton;

public class SingletonUserSession {

    private static SingletonUserSession instance;

    private String name;
    private int age;

    private SingletonUserSession(){}

    public static SingletonUserSession getInstance(){
        if (instance == null)
            instance = new SingletonUserSession();

        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}