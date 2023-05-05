package com.tedu.spring.dilistmap;

import java.util.List;
import java.util.Map;

public class Student {
    private String sName;
    private Integer age;
    private Map<String,String> teacherMap;
    private List<String> subjectList;

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", age=" + age +
                ", teacherMap=" + teacherMap +
                ", subject=" + subjectList +
                '}';
    }

    public List<String> getSubject() {
        return subjectList;
    }

    public void setSubject(List<String> subject) {
        this.subjectList = subject;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, String> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, String> teacherMap) {
        this.teacherMap = teacherMap;
    }
}
