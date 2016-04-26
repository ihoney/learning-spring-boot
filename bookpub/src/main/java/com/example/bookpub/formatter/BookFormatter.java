package com.example.bookpub.formatter;

import com.example.bookpub.entity.Book;
import com.example.bookpub.repository.BookRepository;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

/**
 * Created by hongtao on 16/4/26.
 */
public class BookFormatter implements Formatter<Book> {

    private BookRepository bookRepository;

    public BookFormatter(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book parse(String bookIdentifier, Locale locale) throws ParseException {
        Optional<Book> book = Optional.ofNullable(bookRepository.findBookByIsbn(bookIdentifier));
        if (book.isPresent()) {
            return book.get();
        }

        return bookRepository.findOne(Long.valueOf(bookIdentifier));
    }

    @Override
    public String print(Book book, Locale locale) {
        return book.getIsbn();
    }
}
