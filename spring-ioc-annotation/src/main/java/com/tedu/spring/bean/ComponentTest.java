package com.tedu.spring.bean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentTest {
    @Test
    public void componentTest() {
        User user = new ClassPathXmlApplicationContext("bean.xml").getBean("user", User.class);
        System.out.println(user);
    }
}
