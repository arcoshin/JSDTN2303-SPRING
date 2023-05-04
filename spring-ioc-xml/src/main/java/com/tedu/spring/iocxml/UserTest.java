package com.tedu.spring.iocxml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    //1.根據id屬性獲取bean對象
    @Test
    public void idTest() {
        //加載xml配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //獲取對象
        User user1 = (User) context.getBean("user");

        //調用方法
        user1.sayHi();
    }
//
//    //2.根據class屬性獲取bean對象
//    @Test
//    public void classTest() {
//        //加載xml配置文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//
//        //獲取對象
//        User user2 = context.getBean(User.class);
//
//        //調用方法
//        user2.sayHi();
//    }

    //3.根據id及class屬性獲取bean對象
    @Test
    public void idClassTest() {
        //加載xml配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //獲取對象
        User user3 = context.getBean("user", User.class);

        //調用方法
        user3.sayHi();
    }

}
