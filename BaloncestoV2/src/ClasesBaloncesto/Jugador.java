package ClasesBaloncesto;
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
	
	//Metodo para calcular cuantos puntos ha conseguido en una temporada
	public int calcularPuntuacionTemporada() {
		int puntosTotales=0;
		for(int i=0;i<partidosJugados.size();i++) {
			puntosTotales=puntosTotales+partidosJugados.get(i).getPuntosConseguidos();
		}
		return puntosTotales;
	}
	
	//Metodo para saber cuantos partidos ha sido convocado un jugador
	public int calcularPartidosConvocados() {
		int numPartidosConvocado=0;
		for(int i=0;i<partidosJugados.size();i++) {
			numPartidosConvocado++;
		}
		return numPartidosConvocado;
	}
	
	//Metodo que muestra los partidos jugados por un jugador y su puntuacion en ellos
	public void mostrarPartidosYpuntuaciones() {
		for(int i=0;i<partidosJugados.size();i++) {
			System.out.print("Partido numero: "+partidosJugados.get(i).getNumeroPartido()+" ");
			System.out.println("Valoracion obtenida: "+partidosJugados.get(i).getValoracionObtenida());
		}
	}
	
	//Metodo para calcular la valoracion mas alta obtenida durante la temporada
	public double calcularValoracionMasAlta() {
		double valoracionMasAlta=0;
		
		for(int i=0;i<partidosJugados.size();i++) {
			if(partidosJugados.get(i).getValoracionObtenida()>valoracionMasAlta) {
				valoracionMasAlta=partidosJugados.get(i).getValoracionObtenida();
			}
		}
		return valoracionMasAlta;
	}
	
	//Metodo para cargar datos de forma aleatoria
	public void cargarPartidos() {
		for(int i=0;i<(int)(Math.random()*15)+1;i++) {
			partidosJugados.add(new DatosPartidoJugado((int)(Math.random()*15)+1,"Equipo"+i,(int)(Math.random()*90),(int)(Math.random()*40),
					(int)(Math.random()*40),(int)(Math.random()*30),(int)(Math.random()*30), (int)(Math.random()*10)+1));
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
