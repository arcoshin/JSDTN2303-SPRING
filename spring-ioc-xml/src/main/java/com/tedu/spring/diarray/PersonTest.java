package com.tedu.spring.diarray;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    @Test
    public void personTest1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
    }
}
