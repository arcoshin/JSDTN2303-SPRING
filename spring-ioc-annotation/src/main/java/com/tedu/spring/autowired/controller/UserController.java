package com.tedu.spring.autowired.controller;

import com.tedu.spring.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    /**
     * 當自動裝配的對象出現一個以上的時候，就需要多一個@Qualifier註解預先決定
     */
    @Qualifier("userServiceImpl2")

//    1.通過參數注入
    @Autowired(required = true) //required要求注入對象必須存在且注入成功，否則直接報錯(默認true)
    private UserService userService;

//    2.通過set方法注入
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

//    3.通過形參注入(少用)
//    public void setUserService( @Autowired UserService userService) {
//        this.userService = userService;
//    }

//    4.通過構造方法注入
//    @Autowired
//    public ReController(@Qualifier("userServiceImpl2") UserService userService) {
//        this.userService = userService;
//    }

    public void check() {
        System.out.println("controller正在執行......");
        userService.service();
    }
}
