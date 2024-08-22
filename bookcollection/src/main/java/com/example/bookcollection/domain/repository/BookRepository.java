package com.example.bookcollection.domain.repository;

import com.example.bookcollection.domain.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository{


    List<Book> findAll();
    Optional<Book> findById(Long id);
    Object save(Book book);
    void deleteById(Long id);

}
