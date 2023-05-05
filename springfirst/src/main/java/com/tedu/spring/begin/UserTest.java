package com.tedu.spring.begin;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test() throws Exception{
        /**
         * 使用spring創建對象
         */

        //1.加載xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");

        //2.獲取對象
        User user1 = (User) context.getBean("user");

        //3.調用方法
        user1.add();

        /**
         * 使用new創建對象
         */
        User user2 = new User();
        user2.add();

        /**
         * 使用反射創建對象
         */
        Class cls = Class.forName("com.tedu.spring.begin.User");
        User user3 = (User) cls.newInstance();
        user3.add();

    }
}
