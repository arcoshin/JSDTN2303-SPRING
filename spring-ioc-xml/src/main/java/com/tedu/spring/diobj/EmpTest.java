package com.tedu.spring.diobj;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
    /**
     * 外部bean方式
     * 聲明另外一個bean傳入
     */
    @Test
    public void empTest1 () {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diobj.xml");
        Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println("emp1" + emp1);
    }


    /**
     * 內部bean方式
     * 其實就是嵌套聲明
     */
    @Test
    public void empTest2 () {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diobj.xml");
        Emp emp2 = context.getBean("emp2", Emp.class);
        System.out.println("emp2" + emp2);
    }

    /**
     * 級聯屬性賦值:修改已注入的屬性
     */
    @Test
    public void empTest3 () {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diobj.xml");
        Emp emp3 = context.getBean("emp3", Emp.class);
        System.out.println("emp3" + emp3);
    }
}
