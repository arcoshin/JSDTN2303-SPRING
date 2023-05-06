package com.tedu.spring.autowired.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl1 implements UserService {
    @Override
    public void service() {
        System.out.println("service1方法正在執行......");
    }
}
