package com.biblioteca_api.biblioteca_api.controller;

import com.biblioteca_api.biblioteca_api.enums.StatusBook;
import com.biblioteca_api.biblioteca_api.model.Loan;
import com.biblioteca_api.biblioteca_api.repository.BookRepository;
import com.biblioteca_api.biblioteca_api.repository.LoanRepository;
import com.biblioteca_api.biblioteca_api.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private ReaderRepository readerRepository;

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("{idReader}/{idBook}")
    public void loanABook(@PathVariable String idReader, @PathVariable String idBook) throws Exception {
       var reader = readerRepository.findById(idReader).orElseThrow(() -> new Exception("Reader not found"));
       var book = bookRepository.findById(idBook).orElseThrow(() -> new Exception("Book not found"));

       if(book.getAvailable() != StatusBook.AVAILABLE){
           throw new Exception("Book already was rented. It will be back soon. Wait for it");
       }

       book.setAvailable(StatusBook.NOT_AVAILABLE);
       bookRepository.save(book);

       var loan = new Loan();
       loan.setReader(reader);
       loan.setBook(book);
       loan.setDateLoan(LocalDate.now());
       loan.setDateReturn(LocalDate.now().plusDays(10));

       loanRepository.save(loan);
    }
}