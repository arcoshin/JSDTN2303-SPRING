package cn.tedu.homework.di;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListTest {
    /**
     * 使用set方法注入
     */
    @Test
    public void setTest(){
        System.out.println(
                new ClassPathXmlApplicationContext("list.xml").getBean("setList")
        );
    }


    /**
     * 使用構造方法注入
     */
    @Test
    public void consTest(){
        System.out.println(
                new ClassPathXmlApplicationContext("list.xml").getBean("consList")
        );
    }

}
