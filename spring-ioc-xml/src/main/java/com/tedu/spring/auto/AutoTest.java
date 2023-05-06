package com.tedu.spring.auto;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {
    /**
     * 自動裝配特性中可發現:
     * 若是xml檔案中找到0個對應的需求類型(dept)，autowire="byType"，則返回null
     * 若是xml檔案中找到1個對應的需求類型(dept)，autowire="byType"，則返回該對象
     * 若是xml檔案中找到2個對應的需求類型(dept)，autowire="byType"，無法分辨使用何者則報錯，這時則應該使用autowire="byName"
     * 但使用byName就不能指定id名稱，默認直接使用與類名同名的對象，若無則一樣返回null
     */
    @Test
    public void auto() {
        Emp emp1 = new ClassPathXmlApplicationContext("bean-auto.xml").getBean("emp1", Emp.class);
        System.out.println(emp1);
    }
}
