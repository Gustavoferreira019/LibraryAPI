package com.biblioteca_api.biblioteca_api.controller;

import com.biblioteca_api.biblioteca_api.model.Book;
import com.biblioteca_api.biblioteca_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public void registerANewBook(@RequestBody Book book) {
        service.register(book);
    }

    @GetMapping
    public List<Book> findAll() {
        return service.findAll();
    }

    @GetMapping("/{titleBook}")
    public Book findBook(@PathVariable String titleBook) {
        return service.findByTitle(titleBook);
    }

    @PatchMapping("/{idBook}")
    public void updateBook(@PathVariable String idBook, @RequestBody Book book) {
        service.updateBook(idBook,book);
    }

    @DeleteMapping("/{idBook}")
    public void deleteBookById(@PathVariable String idBook){
        service.deleteBook(idBook);
    }
}