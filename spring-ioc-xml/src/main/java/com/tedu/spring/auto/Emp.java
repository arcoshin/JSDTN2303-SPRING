package com.tedu.spring.auto;

public class Emp {
    private String eName;
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "eName='" + eName + '\'' +
                ", dept=" + dept +
                '}';
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
