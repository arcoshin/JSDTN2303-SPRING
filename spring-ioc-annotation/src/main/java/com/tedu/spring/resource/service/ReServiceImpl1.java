package com.tedu.spring.resource.service;

import org.springframework.stereotype.Service;

@Service(value = "reServiceImpl1")
public class ReServiceImpl1 implements ReService {
    @Override
    public void reRun() {
        System.out.println("reServiceImpl1...已經執行!");
    }
}
