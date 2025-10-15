package gustavoferreira019.com.github.libraryApi.model;

import gustavoferreira019.com.github.libraryApi.enums.GeneroLivro;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Livro {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false, length = 36)
    private String id;

    @Column(nullable = false)
    private String isbn;

    @Column(nullable = false)
    private String titulo;

    private LocalDate dataPublicacao;

    @Enumerated(EnumType.STRING)
    private GeneroLivro genero;

    private Double preco;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;
}
