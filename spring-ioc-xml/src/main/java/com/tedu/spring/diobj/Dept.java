package com.tedu.spring.diobj;

/**
 * 部門類
 */
public class Dept {
    private String dept_Name;

    @Override
    public String toString() {
        return "Dept{" +
                "dept_Name='" + dept_Name + '\'' +
                '}';
    }

    public String getDept_Name() {
        return dept_Name;
    }

    public void setDept_Name(String dept_Name) {
        this.dept_Name = dept_Name;
    }
}
