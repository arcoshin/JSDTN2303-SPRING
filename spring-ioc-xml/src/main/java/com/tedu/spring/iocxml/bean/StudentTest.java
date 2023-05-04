package com.tedu.spring.iocxml.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    /**
     * 測試透過spring獲取對象時，是否可以智能獲取該對象的實現類
     *
     * 發現 : 向上造型範圍內都可以
     */

    @Test
    public void ipmTest1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student_1 student1 =  context.getBean("student1", Student_1.class);//使用該類自身的類對象
        student1.run();
    }

    @Test
    public void ipmTest2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student_1 student2 = (Student_1) context.getBean("student1", Student_2.class);//使用父類的類對象，強轉:向下轉型
        student2.run();
    }

    @Test
    public void ipmTest3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student_1 student3 = (Student_1) context.getBean("student1", Student.class);//使用接口的類對象，強轉:向下轉型
        student3.run();
    }
}
