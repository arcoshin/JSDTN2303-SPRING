package com.tedu.spring.dibase;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookPage;

    public Book() {

    }


    public Book(String bookName, String bookAuthor, String bookPage) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPage = bookPage;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPage='" + bookPage + '\'' +
                '}';
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

//    public void setBookPage(String bookPage) {
//        this.bookPage = bookPage;
//    }
}
