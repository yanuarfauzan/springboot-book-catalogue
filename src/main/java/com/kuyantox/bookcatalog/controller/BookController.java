package com.kuyantox.bookcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kuyantox.bookcatalog.form.BookForm;
import com.kuyantox.bookcatalog.model.Book;
import com.kuyantox.bookcatalog.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public String findBookList(Model model) {
        List<Book> books = bookService.findBookAll();
        model.addAttribute("books", books);
        return "book/book-list";
    }

    @GetMapping("/book-create")
    public String loadBookForm(Model model) {
        model.addAttribute("bookForm", new BookForm());
        return "book/book-create";
    }

    @PostMapping("/new")
    public String addNewBook(@ModelAttribute BookForm bookForm) {
        bookService.CreateNewBook(bookForm);
        return "redirect:/book/list";
    }
}
