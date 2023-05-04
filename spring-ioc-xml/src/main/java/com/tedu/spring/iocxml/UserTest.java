package com.tedu.spring.iocxml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    //1.測試bean對象的創建以及根據id屬性獲取bean對象
    @Test
    public void idTest(){
        //加載xml配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //獲取對象
        User user = (User) context.getBean("user");

        //調用方法
        user.sayHi();
    }

}
