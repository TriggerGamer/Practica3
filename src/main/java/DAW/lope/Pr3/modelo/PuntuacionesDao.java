package DAW.lope.Pr3.modelo;

import java.util.List;
import java.util.Optional;

public interface PuntuacionesDao {
	int count();
	int save(Puntuaciones pts);
	int update(Puntuaciones pts);
	int deleteById(int id);
	List<Puntuaciones> findAll();
	Optional<Puntuaciones> findById(int id);
	String getNameById(int id);

}