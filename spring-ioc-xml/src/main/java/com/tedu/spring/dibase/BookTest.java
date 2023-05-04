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
        Book book = (Book) context.getBean("book");
        book.setBookName("thinking in java");
        book.setBookAuthor("Bruce Eckel");
        System.out.println(book);
    }

}
