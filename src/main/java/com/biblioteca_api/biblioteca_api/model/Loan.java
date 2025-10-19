package com.biblioteca_api.biblioteca_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_loan")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "readerId", referencedColumnName = "id")
    private Reader reader;

    @OneToOne
    @JoinColumn(name = "bookId", referencedColumnName = "id")
    private Book book;

    private LocalDate dateLoan;

    private LocalDate dateReturn;
}
