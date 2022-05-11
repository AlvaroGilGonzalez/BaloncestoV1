package MiembrosBaloncesto;

public class Persona {
	
	//Atributos del objeto
	private String nombre;
	private String apellidos;
	private String dni;
	
	//Metodo constructor por parametro
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	//Metodo que nos devuelve un String con la informacion de la persona
	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni;
	}
	
	//Metodo getter para el nombre de la persona
	public String getNombre() {
		return nombre;
	}

	
	
	

}
