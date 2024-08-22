package com.example.bookcollection.interfaceL;

import com.example.bookcollection.application.BookService;
import com.example.bookcollection.domain.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String start(){
        return ("Welcome to the Start Page!");
    }

    //searchId/5
    @GetMapping("/searchId/{id}")
    public ResponseEntity<Optional<Book>> getBookByIdPathParam(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    //searchId?id=5
    @GetMapping("/searchId")
    public ResponseEntity<Optional<Book>> getBookByIdQueryParam(@RequestParam(required = true) Long id) {
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    @GetMapping("/searchAll")
    public ResponseEntity<List<Book>> searchAllBooks(){
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/searchAuthor")
    public ResponseEntity<List<Book>> searchBooksByAuthor(@RequestParam(required = true)
    String author){
        List<Book> books = bookService.getBookByAuthor(author);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/searchTitle")
    public ResponseEntity<List<Book>> searchBookByTitle(@RequestParam (required = true) String title){
            List<Book> books = bookService.getBookByTitle(title);
            return ResponseEntity.ok(books);
    }


    @PostMapping("/new")
    public ResponseEntity<Void> createBook(@RequestBody Book book){
        bookService.createBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateBook(@RequestParam(required = true) Long id, @RequestBody Book updatedBook){
        bookService.updateBook(id,updatedBook);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteBook(@RequestParam(required = true) Long id){
        bookService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}