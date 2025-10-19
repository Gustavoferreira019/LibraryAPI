package com.biblioteca_api.biblioteca_api.service;

import com.biblioteca_api.biblioteca_api.model.Reader;
import com.biblioteca_api.biblioteca_api.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderService {

    @Autowired
    private ReaderRepository repository;

    public void createReader(Reader reader) {
        repository.save(reader);
    }

    public Reader findByName(String nameReader) {
        return repository.findByNameContainingIgnoreCase(nameReader)
                .orElseThrow(() -> new RuntimeException("Reader not found"));
    }

    public void updateReader(String idReader, Reader readerUpdate) {
        Reader readerFound = repository.findById(idReader)
                .orElseThrow(() -> new RuntimeException("Reader not found"));

        readerFound.setName(readerUpdate.getName());
        readerFound.setEmail(readerUpdate.getEmail());
        repository.save(readerFound);
    }

    public void deleteReader(String idReader) {
        repository.deleteById(idReader);
    }
}

