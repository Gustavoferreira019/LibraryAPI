package com.biblioteca_api.biblioteca_api.controller;

import com.biblioteca_api.biblioteca_api.model.Reader;
import com.biblioteca_api.biblioteca_api.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reader")
public class ReaderController {

    @Autowired
    private ReaderService service;

    @PostMapping("/register")
    public void createReader(@RequestBody Reader reader) {
        service.createReader(reader);
    }

    @GetMapping("/{nameReader}")
    public Reader findReaderByName(@PathVariable String nameReader) {
        return service.findByName(nameReader);
    }

    @PutMapping("/{idReader}")
    public void updateReader(@PathVariable String idReader, @RequestBody Reader readerUpdate) {
        updateReader(idReader, readerUpdate);
    }

    @DeleteMapping("/{idReader}")
    public void deleteReader(@PathVariable String idReader) {
        service.deleteReader(idReader);
    }
}