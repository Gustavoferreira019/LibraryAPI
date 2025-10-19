package com.biblioteca_api.biblioteca_api.repository;

import com.biblioteca_api.biblioteca_api.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, String> {
    Optional<Book> findByTitleContainingIgnoreCase(String titleBook);
}