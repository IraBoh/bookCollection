
package com.example.bookcollection.infrastructure.persistence;

import com.example.bookcollection.domain.model.Book;
import com.example.bookcollection.domain.repository.BookRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBookRepository extends JpaRepository<Book, Long>, BookRepository {
}
