package DAW.lope.Pr3.modelo;


public class Puntuaciones {
	private int id_Usuario;
	private int puntuacion;
	private String personaje;
	
	public Puntuaciones(int id_usuario, int puntuacion, String personaje) {
		this.id_Usuario = id_usuario;
		this.puntuacion = puntuacion;	
		this.personaje = personaje;
	}
	
	//getters and setters
	public int getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(int id_usuario) {
		this.id_Usuario = id_usuario;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getPersonaje() {
		return personaje;
	}

	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}

}


