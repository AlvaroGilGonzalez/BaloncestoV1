package ClasesBaloncesto;
//Realizado por Alvaro Gil Gonzalez 25/03/2022
public class Socio extends Persona {
	
	//Atributos del objeto
	private double cuota;

	//Metodo constructor por parametro
	public Socio(String nombre, String apellidos, String dni, double cuota) {
		super(nombre, apellidos, dni);
		this.cuota = cuota;
	}
	
	//Metodo que nos devuelve un String con la informacion del objeto
	@Override
	public String toString() {
		return "Socio [cuota=" + cuota + ", toString()=" + super.toString() + "]";
	}

	
	
	
	

	
	
	

}
