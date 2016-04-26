package com.example.bookpub;

import com.example.bookpub.entity.Author;
import com.example.bookpub.entity.Book;
import com.example.bookpub.entity.Publisher;
import com.example.bookpub.repository.AuthorRepository;
import com.example.bookpub.repository.BookRepository;
import com.example.bookpub.repository.PublisherRepository;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by hongtao on 16/4/26.
 */
public class StartupRunner implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    @Autowired
    private DataSource dataSource;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void run(String... strings) throws Exception {
        addDataToDB();

        logger.info("hello");
        logger.info("Datasource: " + dataSource.toString());
        logger.info("Number of books: " + bookRepository.count());
    }

    private void addDataToDB() {
        Author author = new Author("Alex", "Antonov");
        author = authorRepository.save(author);

        Publisher publisher = new Publisher("Packt");
        publisher = publisherRepository.save(publisher);

        Book book = new Book("978-1-78528-415-1", "Spring Boot Recipes", author, publisher);
        bookRepository.save(book);
    }

    @Scheduled(initialDelay = 1000, fixedRate = 10000)
    public void run() {
        logger.info("Number of books: " + bookRepository.count());
    }
}
