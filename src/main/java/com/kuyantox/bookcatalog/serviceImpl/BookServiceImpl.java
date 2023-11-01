package com.kuyantox.bookcatalog.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.kuyantox.bookcatalog.form.BookForm;
import com.kuyantox.bookcatalog.model.Book;
import com.kuyantox.bookcatalog.service.BookService;

@Service
public class BookServiceImpl implements BookService {
    List<Book> books = new ArrayList();

    public BookServiceImpl() {
        super();
        Book book1 = new Book();
        book1.setId("1");
        book1.setTitle("Harry Potter");
        book1.setAuthor("JK. Rowling");
        book1.setDescription("Harry Potter seri 1");
        books.add(book1);
    }

    @Override
    public List<Book> findBookAll() {
        return books;
    }

    public void CreateNewBook(BookForm bookForm) {
        Book book = new Book();
        book.setTitle(bookForm.getTitle());
        book.setAuthor(bookForm.getAuthor());
        book.setDescription(bookForm.getDescription());
        book.setId(UUID.randomUUID().toString());
        books.add(book);
    }
}
