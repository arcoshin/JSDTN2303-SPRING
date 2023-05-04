package com.tedu.spring.exercise;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {
    @Test
    public void setTest(){
        Product p1 = new ClassPathXmlApplicationContext("bean-product.xml").getBean("productSet", Product.class);
        System.out.println(p1);
    }

    @Test
    public void consTest(){
        Product p2 = new ClassPathXmlApplicationContext("bean-product.xml").getBean("productCons", Product.class);
        System.out.println(p2);
    }
}
