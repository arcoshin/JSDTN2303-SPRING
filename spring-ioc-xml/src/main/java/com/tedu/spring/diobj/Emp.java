package com.tedu.spring.diobj;

/**
 * 員工類
 */
public class Emp {
    private String empName;
    private Double salary;
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", salary=" + salary +
                ", dept=" + dept +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
