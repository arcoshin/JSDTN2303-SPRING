package com.tedu.spring.life;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest {
    /**
     *    取值                     含义                             创建对象时机
     * singleton     （默认） 在IoC容器中，这个bean的对象为单实例      IoC容器初始化时
     * prototype      这个bean在IoC容器中有多个实例                    获取bean时
     *
     *=====================
     * 面試題 bean生命週期(5或7個階段)
     *=====================
     * 1.實例化階段 : 構造器中打印驗證
     * 2.注入賦值階段 : set方法中打印驗證(因為使用properties標籤是透過set方法注入的)
     * 3.初始化階段 :定義初始化方法(其中又分3.1:初始化前階段及3.2:初始化後) ---> BeanPostProcessor
     * 4.使用階段 : getBean()後使用
     * 5.銷毀階段
     */
    @Test
    public void lifeTest_property_singleton(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user", User.class);
        //4.使用階段
        System.out.println("4.使用階段:bean已被使用!");
        //5.銷毀階段
        context.close();
    }
}
