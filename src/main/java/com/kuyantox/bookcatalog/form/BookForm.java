package com.kuyantox.bookcatalog.form;

public class BookForm {
    private String title;
    private String author;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BookForm(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public BookForm() {
    }

}
