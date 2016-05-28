package com.example.repository;

import com.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by floodliu on 16/5/28.
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByIsbn(String isbn);
}
