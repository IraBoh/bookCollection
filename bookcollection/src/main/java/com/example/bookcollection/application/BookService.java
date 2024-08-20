package com.example.bookcollection.application;

import com.example.bookcollection.domain.model.Book;
import com.example.bookcollection.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository= bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }
    public void createBook(Book book){
        bookRepository.save(book);
    }
    public void updateBook(Long id, Book updatedBook){
        updatedBook.setId(id);
        bookRepository.save(updatedBook);
    }

    public void deleteById(Long id){
        bookRepository.deleteById(id);
    }

}
