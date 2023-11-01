package com.kuyantox.bookcatalog.service;

import java.util.List;

import com.kuyantox.bookcatalog.form.BookForm;
import com.kuyantox.bookcatalog.model.Book;

public interface BookService {
    public List<Book> findBookAll();
    public void CreateNewBook(BookForm bookForm)
}
