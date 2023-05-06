package com.tedu.spring.scope;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    @Test
    public void singletonTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        /**
         * 獲取兩次對象:可發現兩次創建的對象內存地址相同--->同一個對象
         */
        System.out.println(context.getBean("user1", User.class));//com.tedu.spring.scope.User@8646db9
        System.out.println(context.getBean("user1", User.class));//com.tedu.spring.scope.User@8646db9

    }

    @Test
    public void prototypeTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        /**
         * 獲取兩次對象:可發現兩次創建的對象內存地址不同--->是不同對象
         */
        System.out.println(context.getBean("user2",User.class));//com.tedu.spring.scope.User@52f759d7
        System.out.println(context.getBean("user2",User.class));//com.tedu.spring.scope.User@7cbd213e
    }
}
