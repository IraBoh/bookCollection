package com.example.bookcollection;

import com.example.bookcollection.domain.model.Book;
import com.example.bookcollection.infrastructure.persistence.JpaBookRepository;
import com.example.bookcollection.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final BookRepository bookRepository;

    @Autowired
    public DataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
    bookRepository.save(new Book(1L,"Story", "Andersen"));
    bookRepository.save(new Book(2L,"Funny", "Henry"));
    bookRepository.save(new Book(3L,"test", "test"));

        System.out.println("Test data added!");
    }

}