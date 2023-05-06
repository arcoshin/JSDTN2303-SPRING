package com.tedu.spring.autowired.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {
    @Override
    public void service() {
        System.out.println("service2方法正在執行......");
    }
}
