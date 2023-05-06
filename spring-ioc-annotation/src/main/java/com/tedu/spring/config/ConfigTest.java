package com.tedu.spring.config;

import com.tedu.spring.resource.controller.ReController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 全註解開發
 */
public class ConfigTest {
    @Test
    public void configurationTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfiguration.class);
        ReController controller = context.getBean(ReController.class);
        controller.runController();
    }
}
