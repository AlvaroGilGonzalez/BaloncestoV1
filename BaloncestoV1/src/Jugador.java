//Realizado por Alvaro Gil Gonzalez 25/03/2022
import java.util.ArrayList;

public class Jugador extends Socio {
	
	//Atributos del objeto
	private int dorsalJugador;
	private String posicionJugador;
	private ArrayList <DatosPartidoJugado> partidosJugados;
	
	//Metodo constructor por parametros
	public Jugador(String nombre, String apellidos, String dni, double cuota, int dorsalJugador, String posicionJugador) {
		super(nombre, apellidos, dni, cuota);
		this.dorsalJugador = dorsalJugador;
		this.posicionJugador = posicionJugador;
		this.partidosJugados = new ArrayList();
	}
	
	//Metodo para añadir partidos a un jugador
	public void annadirPartidoConvocado(int numeroPartido, String nombreRival, double minutosJugados, int puntosConseguidos,
			int rebotes, int asistencias, int tapones, double valoracionObtenida) {
		
		partidosJugados.add(new DatosPartidoJugado(numeroPartido, nombreRival,minutosJugados,puntosConseguidos,
			rebotes, asistencias, tapones, valoracionObtenida));
	}
	
	//Metodo para ver los partidos que ha jugado un jugador
	public void mostrarPartidosJugados() {
		for(int i=0;i<partidosJugados.size();i++) {
			System.out.println(partidosJugados.get(i).toString()); 
		}
		
	}
	//Metodos getters
	public int getDorsalJugador() {
		return dorsalJugador;
	}

	public String getPosicionJugador() {
		return posicionJugador;
	}

	
	
	
}
