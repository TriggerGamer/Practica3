package DAW.lope.Pr3.modelo;

import java.awt.print.Book;
import java.util.Optional;

public interface PuntuacioensDao {
	int count();
	int save(Puntuaciones pts);
	int update(Puntuaciones pts);
	int deleteById(Long id);
	Optional<Book> findById(Long id);
	String getNameById(Long id);
}
