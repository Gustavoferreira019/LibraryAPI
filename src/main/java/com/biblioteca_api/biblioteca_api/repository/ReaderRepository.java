package com.biblioteca_api.biblioteca_api.repository;

import com.biblioteca_api.biblioteca_api.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReaderRepository extends JpaRepository<Reader, String> {
    Optional<Reader> findByNameContainingIgnoreCase(String reader);
}