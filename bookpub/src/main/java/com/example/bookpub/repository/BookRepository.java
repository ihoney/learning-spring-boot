package com.example.bookpub.repository;

import com.example.bookpub.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hongtao on 16/4/26.
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Book findBookByIsbn(String isbn);
}
