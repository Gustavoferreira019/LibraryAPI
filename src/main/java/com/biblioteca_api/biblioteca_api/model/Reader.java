package com.biblioteca_api.biblioteca_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "tb_reader")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reader {

    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(columnDefinition = "char(36)")
    private String id;

    private String name;

    private String email;

    @OneToOne(mappedBy = "reader")
    private Loan loan;
}
