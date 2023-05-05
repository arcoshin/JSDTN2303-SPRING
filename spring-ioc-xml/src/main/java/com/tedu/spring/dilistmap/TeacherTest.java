package com.tedu.spring.dilistmap;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest {
    /**
     * List集合測試
     */
    @Test
    public void listTeacher() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Teacher listTeacher = context.getBean("listTeacher", Teacher.class);
        System.out.println(listTeacher);
    }

    /**
     * Map集合測試
     */
    @Test
    public void mapStudent() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student mapStudent = context.getBean("mapStudent", Student.class);
        System.out.println(mapStudent);
    }

    /**
     * 引入外部util測試
     */
    @Test
    public void utilTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student stuUtil = context.getBean("stuUtil", Student.class);
        System.out.println(stuUtil);
    }

    /**
     * 引入外部p命名空間
     */
    @Test
    public void pTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student stup = context.getBean("stup", Student.class);
        System.out.println(stup);
    }


}
