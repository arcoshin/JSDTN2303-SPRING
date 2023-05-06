package com.tedu.spring.auto;

public class Dept {
    private String dName;

    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                '}';
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
}
