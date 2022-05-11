package ClasesBaloncesto;
//Realizado por Alvaro Gil Gonzalez 25/03/2022
public class Trabajador extends Persona {
	
	//Atributos del objeto
	private String tipoTrabajador;
	private double remuneracion;
	
	//Metodo constructor por parametros
	public Trabajador(String nombre, String apellidos, String dni, String tipoTrabajador, double remuneracion) {
		super(nombre, apellidos, dni);
		this.tipoTrabajador = tipoTrabajador;
		this.remuneracion = remuneracion;
	}

	//Metodo que nos devuelve un String con la informacion del objeto
	@Override
	public String toString() {
		return "Trabajador [tipoTrabajador=" + tipoTrabajador + ", remuneracion=" + remuneracion +super.toString() + "]";
	}
	
	
	
	
}
