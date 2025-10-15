package gustavoferreira019.com.github.libraryApi.repository;

import gustavoferreira019.com.github.libraryApi.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AutorRepository extends JpaRepository<Autor, String> {
}
