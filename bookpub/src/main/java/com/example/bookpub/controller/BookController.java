package com.example.bookpub.controller;

import com.example.bookpub.entity.Book;
import com.example.bookpub.formatter.IsbnEditor;
import com.example.bookpub.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hongtao on 16/4/26.
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @RequestMapping(value = "/{isbn}", method = RequestMethod.GET)
    public Book getBook(@PathVariable("isbn") String isbn) {
        return bookRepository.findBookByIsbn(isbn);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(IsbnEditor.class, new IsbnEditor());
    }
}
