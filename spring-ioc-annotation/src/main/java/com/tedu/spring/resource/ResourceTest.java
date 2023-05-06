package com.tedu.spring.resource;

import com.tedu.spring.resource.controller.ReController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceTest {
    @Test
    public void resourceTest() {
        ReController reController = new ClassPathXmlApplicationContext("bean.xml").getBean(ReController.class);
        reController.runController();
    }
}
