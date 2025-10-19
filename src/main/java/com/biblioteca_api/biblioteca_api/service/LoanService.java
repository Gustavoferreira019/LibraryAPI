package com.biblioteca_api.biblioteca_api.service;

import com.biblioteca_api.biblioteca_api.enums.StatusBook;
import com.biblioteca_api.biblioteca_api.model.Loan;
import com.biblioteca_api.biblioteca_api.repository.BookRepository;
import com.biblioteca_api.biblioteca_api.repository.LoanRepository;
import com.biblioteca_api.biblioteca_api.repository.ReaderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private ReaderRepository readerRepository;

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public void loanBook(String idReader, String idBook) throws Exception {
        var reader = readerRepository.findById(idReader)
                .orElseThrow(() -> new Exception("Reader not found"));
        var book = bookRepository.findById(idBook)
                .orElseThrow(() -> new Exception("Book not found"));

        if (book.getAvailable() != StatusBook.AVAILABLE) {
            throw new Exception("Book already rented. Wait for it to return.");
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