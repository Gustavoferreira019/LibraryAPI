package com.biblioteca_api.biblioteca_api.repository;

import com.biblioteca_api.biblioteca_api.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long> {}