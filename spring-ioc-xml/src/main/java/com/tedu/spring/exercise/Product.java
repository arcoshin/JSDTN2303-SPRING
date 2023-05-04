package com.tedu.spring.exercise;

public class Product {
    private String title;
    private int num;
    private int sales;
    private String comment;

    public Product() {

    }

    public Product(String title, int num, int sales, String comment) {
        this.title = title;
        this.num = num;
        this.sales = sales;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "product{" +
                "title='" + title + '\'' +
                ", num=" + num +
                ", sales=" + sales +
                ", comment='" + comment + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
