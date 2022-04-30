/*En esta clase guardamos todos los datos que se deben almacenar cada vez que vamos a guardar un partido nuevo para un objeto jugador*/
//Realizado por Alvaro Gil Gonzalez 25/03/2022
public class DatosPartidoJugado {
	
	//Atributos del objeto
	private int numeroPartido;
	private String nombreRival;
	private double minutosJugados;
	private int puntosConseguidos;
	private int rebotes;
	private int asistencias;
	private int tapones;
	private double valoracionObtenida;
	
	//Metodo constructor por parametros
	public DatosPartidoJugado(int numeroPartido, String nombreRival, double minutosJugados, int puntosConseguidos,
			int rebotes, int asistencias, int tapones, double valoracionObtenida) {
		this.numeroPartido = numeroPartido;
		this.nombreRival = nombreRival;
		this.minutosJugados = minutosJugados;
		this.puntosConseguidos = puntosConseguidos;
		this.rebotes = rebotes;
		this.asistencias = asistencias;
		this.tapones = tapones;
		this.valoracionObtenida = valoracionObtenida;
	}

	//Metodo que devuelve un String con la informacion del objeto
	@Override
	public String toString() {
		return "numeroPartido=" + numeroPartido + ", nombreRival=" + nombreRival
				+ ", minutosJugados=" + minutosJugados + ", puntosConseguidos=" + puntosConseguidos + ", rebotes="
				+ rebotes + ", asistencias=" + asistencias + ", tapones=" + tapones + ", valoracionObtenida="
				+ valoracionObtenida;
	}
	
	
	
	
}
