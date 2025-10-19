package com.biblioteca_api.biblioteca_api.model;

import com.biblioteca_api.biblioteca_api.enums.StatusBook;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "tb_book")
@Getter
@Setter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(columnDefinition = "char(36)")
    private String id;

    private String title;

    private String author;

    private String synopsis;

    private String urlImg;

    @Enumerated(EnumType.STRING)
    private StatusBook available = StatusBook.AVAILABLE;

    @OneToOne(mappedBy = "book")
    private Loan loan;
}
