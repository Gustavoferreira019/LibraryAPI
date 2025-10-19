package com.biblioteca_api.biblioteca_api.service;

import com.biblioteca_api.biblioteca_api.model.Book;
import com.biblioteca_api.biblioteca_api.repository.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public void register(Book book) {
        repository.save(book);
    }

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book findByTitle(String titleBook) {
        return repository.findByTitleContainingIgnoreCase(titleBook)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public void updateBook(String idBook, Book bookUpdate) {
        Book bookFound = repository.findById(idBook)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        BeanUtils.copyProperties(bookUpdate, bookFound, getNullPropertyNames(bookUpdate));
        repository.save(bookFound);
    }

    public void deleteBook(String idBook) {
        repository.deleteById(idBook);
    }

    public String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
