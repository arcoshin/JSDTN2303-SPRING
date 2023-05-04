package com.tedu.spring.dibase;
/**
 * DI Dependency Injection
 * 注入依賴，其實就是注入屬性
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    @Test
    public void setTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book",Book.class);
        System.out.println("b1 = " + book);//XML中注入依賴設置的值

        book.setBookName("thinking in java");
        book.setBookAuthor("Bruce Eckel");
        System.out.println("b2 = " + book);
    }

    @Test
    public void consTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("bookCons",Book.class);
        System.out.println("b3 = " + book);//XML中注入依賴設置的值
    }



}
