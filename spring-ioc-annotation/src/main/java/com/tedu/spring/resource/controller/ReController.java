package com.tedu.spring.resource.controller;

import com.tedu.spring.resource.service.ReService;
import com.tedu.spring.resource.service.ReServiceImpl2;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class ReController {
    @Resource(name = "reServiceImpl1")
//    @Resource
    private ReService reService;

    public void runController(){
        System.out.println("reController...已經執行!");
        reService.reRun();
    }


}
