package com.tedu.spring.dilistmap;

import java.util.List;
import java.util.Map;

public class Teacher {
    private String tName;
    private List<Student> studentList;

    @Override
    public String toString() {
        return "Teacher{" +
                "tName='" + tName + '\'' +
                ", studentList=" + studentList +
                '}';
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
