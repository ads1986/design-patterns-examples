package com.design.patterns.creational.builder;

public class Customer {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Customer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private String name;
        private Integer age;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(Integer age){
            this.age = age;
            return this;
        }

        public Customer build(){
            return new Customer(name, age);
        }
    }
}
