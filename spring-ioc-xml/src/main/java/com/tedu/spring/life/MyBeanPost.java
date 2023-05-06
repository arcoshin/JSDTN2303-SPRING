package com.tedu.spring.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost implements BeanPostProcessor {
    /**
     * 初始化前的後置處理器
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3-1:初始化之前的後置處理器已被執行!");
        return bean;
    }

    /**
     * 初始化後的後置處理器
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3-2:初始化之後的後置處理器已被執行!");
        return bean;
    }
}

