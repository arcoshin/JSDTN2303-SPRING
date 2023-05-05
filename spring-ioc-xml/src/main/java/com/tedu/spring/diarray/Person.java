package com.tedu.spring.diarray;

import java.util.Arrays;

public class Person {
    private String name;
    private Integer age;
    private String[] interest;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", interest=" + Arrays.toString(interest) +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }


}
