package com.tedu.spring.autowired;

import com.tedu.spring.autowired.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {
    @Test
    public void autowiredTest(){
        UserController controller = new ClassPathXmlApplicationContext("bean.xml").getBean(UserController.class);
        controller.check();
    }
}
