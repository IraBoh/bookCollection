package com.example.bookcollection.domain.repository;

import com.example.bookcollection.domain.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAll();
    Optional<Book> findById(Long id);
    Object save(Book book);
    void deleteById(Long id);

}
