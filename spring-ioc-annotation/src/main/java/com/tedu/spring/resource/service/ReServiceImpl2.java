package com.tedu.spring.resource.service;

import org.springframework.stereotype.Service;

@Service
public class ReServiceImpl2 implements ReService {
    @Override
    public void reRun() {
        System.out.println("reServiceImpl2...已經執行!");
    }
}
