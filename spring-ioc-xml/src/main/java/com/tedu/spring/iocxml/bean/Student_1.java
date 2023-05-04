package com.tedu.spring.iocxml.bean;

public class Student_1 extends Student_2 implements Student {
    @Override
    public void run() {
        System.out.println("Student_1 is running");
    }
}
