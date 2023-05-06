package com.tedu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 模擬xml配置文件
 */

@Configuration//使之成為配置類
@ComponentScan("com.tedu.spring")//設定掃描範圍
public class MySpringConfiguration {

}
