package gustavoferreira019.com.github.libraryApi;

import gustavoferreira019.com.github.libraryApi.model.Autor;
import gustavoferreira019.com.github.libraryApi.repository.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;

@SpringBootApplication
public class LibraryApiApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(LibraryApiApplication.class, args);
		AutorRepository repository = context.getBean(AutorRepository.class);

		executarSalvarExemplo(repository);
	}

	public static void executarSalvarExemplo(AutorRepository autorRepository) {
		Autor autor = new Autor();
		autor.setNome("Gustavo");
		autor.setNacionalidade("Brasileiro");
		autor.setDataNascimento(LocalDate.of(2002,8,15));

		autorRepository.save(autor);
	}
}