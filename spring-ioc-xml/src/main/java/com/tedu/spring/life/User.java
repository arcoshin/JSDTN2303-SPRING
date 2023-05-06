package com.tedu.spring.life;

public class User {
    /**
     * 驗證初始化階段的方法
     */
    public void initMethod() {
        System.out.println("3.初始化階段:bean已初始化!");
    }

    /**
     * 驗證銷毀階段的方法
     */
    public void destoryMethod() {
        System.out.println("5.銷毀階段:bean已銷毀!");
    }

    private String username;

    public User() {
        System.out.println("1.實例化階段:無參構造已被執行!");
    }

    public void setUsername(String username) {
        System.out.println("2.注入賦值階段:set方法已被執行!");
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
