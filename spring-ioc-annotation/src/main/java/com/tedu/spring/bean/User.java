package com.tedu.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Component(value = "user")
 * 等價於<bean id="user" class="com.tedu.spring.bean.User">
 * 其中value可以忽略，系統自動默認類名
 *
 * 共有四種註解效果皆相同，差別在於分類而已，都是為了創建對象
 * "@Service"     通常用於業務層
 * "@Repository"  通常用於數據層
 * "@Controller"  通常用於控制層
 * "@Component"   通常無特別限制，泛化設計
 */

//@Service
//@Repository
//@Controller
@Component(value = "user")
public class User {

}
