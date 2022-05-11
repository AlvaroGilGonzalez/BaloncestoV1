//Realizado por Alvaro Gil Gonzalez 25/03/2022
import java.util.ArrayList;
import java.util.Scanner;

public class principal {
	
	public static void main (String args[]) {
		//Creamos un arrayList de jugadores y añadimos varios a el para poder hacer comprobaciones
		ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
		jugadores.add(new Jugador("Alvaro","Gil Gonzalez","56565656f",20,8,"pivot"));
		jugadores.add(new Jugador("Jose","Ruiz Santana","23243534C",20,6,"alero"));
		jugadores.add(new Jugador("Alberto","Perez Medina","78796823J",20,1,"base"));
		jugadores.add(new Jugador("Laura","Rico Gutierrez","4759575968JL",20,2,"base"));
		jugadores.add(new Jugador("Carlos","Harillo Fernandez","46385634J",20,10,"pivot"));
		jugadores.add(new Jugador("Juan Manuel","Fernandez Lobato","13375967N",20,5,"alero"));
		jugadores.add(new Jugador("Alfonso","Gonzalez Gonzalez","14355768L",20,4,"base"));
		jugadores.add(new Jugador("Daniel","Monteleone Gutierrez","98765432C",20,9,"pivot"));
		jugadores.add(new Jugador("Fernando","Concepcion Hernandez","34476857M",20,7,"alero"));
		jugadores.add(new Jugador("Gerard","Moreno Garrido","15364557K",20,3,"alero"));
		
		//Añadimos datos de partidos a los distintos jugadores utilizando la funcion que hemos creado
		jugadores.get(0).cargarPartidos();
		jugadores.get(1).cargarPartidos();
		jugadores.get(1).cargarPartidos();
		jugadores.get(2).cargarPartidos();
		jugadores.get(3).cargarPartidos();
		jugadores.get(4).cargarPartidos();
		jugadores.get(5).cargarPartidos();
		jugadores.get(6).cargarPartidos();
		jugadores.get(7).cargarPartidos();
		//jugadores.get(8).cargarPartidos();
		jugadores.get(9).cargarPartidos();
		
		//Datos necesarios para crear objetos de tipo socio, trabajador o jugador
		Scanner input=new Scanner (System.in);
		int opcionMenu,dorsalJugador;
		String nombreSocio,apellidosSocio,dniSocio,nombreTrabajador,apellidosTrabajador,dniTrabajador,tipoTrabajador;
		String nombreJugador,apellidosJugador,dniJugador,posicionJugador;
		double cuotaSocio,remuneracionTrabajador,cuotaJugador;
		
		//Datos necesarios para guardar la informacion sobre un partido
		int numeroPartido,puntosConseguidos,rebotes,asistencias,tapones;
		String equipoRival;
		double minutosJugados,valoracionObtenida;
		
		
		//Entramos al menu y no salimos hasta introducir el numero 10
		do {
			System.out.println("1.Introducir un nuevo socio");
			System.out.println("2.Introducir un nuevo Trabajador");
			System.out.println("3.Introducir un nuevo Jugador");
			System.out.println("4.Añadir informacion del partido de algun jugador");
			System.out.println("5.Mostrar los partidos que ha jugado un jugador");
			//A partir de este punto encontramos las nuevas opciones del menu añadidas en jugadores V2
			System.out.println("6.El dorsal del jugador que más puntos ha conseguido durante temporada.");
			System.out.println("7.El dorsal del jugador que más partidos ha sido convocado durante temporada.");
			System.out.println("8.Para un determinado jugador relacion de partidos convocados y valoracion en cada partido");
			System.out.println("9.Para un jugador cual fue el partido con mayor valoracion obtenida");
			System.out.println("10.Salir del programa");
			
			System.out.println("Introduzca la opcion que desea ejecutar");
			opcionMenu=input.nextInt();
			input.nextLine();
			
			switch(opcionMenu) {
			//Introducimos un nuevo socio
			case 1:{
				System.out.println("Introduzca el nombre del nuevo socio");
				nombreSocio=input.nextLine();
				System.out.println("Introduzca los apellidos del nuevo socio");
				apellidosSocio=input.nextLine();
				System.out.println("Introduzca el dni del nuevo socio");
				dniSocio=input.nextLine();
				System.out.println("Introduzca la cuota que pagará el nuevo socio");
				cuotaSocio=input.nextDouble();
				Socio socio1=new Socio(nombreSocio,apellidosSocio,dniSocio,cuotaSocio);
				break;
			}
			
			//Introducimos un nuevo trabajador
			case 2:{
				System.out.println("Introduzca el nombre del nuevo trabajador");
				nombreTrabajador=input.nextLine();
				System.out.println("Introduzca los apellidos del nuevo trabajador");
				apellidosTrabajador=input.nextLine();
				System.out.println("Introduzca el dni del nuevo trabajador");
				dniTrabajador=input.nextLine();
				System.out.println("Introduzca el tipo del nuevo trabajador");
				tipoTrabajador=input.nextLine();
				System.out.println("Introduzca la remuneracion del nuevo trabajador");
				remuneracionTrabajador=input.nextDouble();
				Trabajador trabajador1=new Trabajador(nombreTrabajador,apellidosTrabajador,dniTrabajador,tipoTrabajador,remuneracionTrabajador);
				break;
			}
			
			//Creamos un nuevo jugador y lo añadimos al arraylist jugadores
			case 3:{
				System.out.println("Introduzca el nombre del nuevo jugador");
				nombreJugador=input.nextLine();
				System.out.println("Introduzca los apellidos del nuevo jugador");
				apellidosJugador=input.nextLine();
				System.out.println("Introduzcan el dni del nuevo jugador:");
				dniJugador=input.nextLine();
				System.out.println("Introduzca la cuota que debe pagar el nuevo jugador");
				cuotaJugador=input.nextDouble();
				System.out.println("Introduzca el dorsal del nuevo jugador");
				dorsalJugador=input.nextInt();
				input.nextLine();
				System.out.println("Introduzca la posicion del nuevo jugador");
				posicionJugador=input.nextLine();
				jugadores.add(new Jugador(nombreJugador,apellidosJugador,dniJugador,cuotaJugador,dorsalJugador,posicionJugador));
				break;
			}
			
			//Seleccionamos el dorsal de un jugador y le añadimos informacion sobre un partido que ha jugado
			case 4:{
				System.out.println("Elija el dorsal del jugador sobre que quiera almacenar informacion referente a un partido");
				for(int i=0;i<jugadores.size();i++){
					System.out.print("Nombre: "+jugadores.get(i).getNombre()+"----------------------");
					System.out.print(" Dorsal: "+jugadores.get(i).getDorsalJugador()+"------------------");
					System.out.println(" Posicion: "+jugadores.get(i).getPosicionJugador());
				}
				dorsalJugador=input.nextInt();
				
				for(int i=0;i<jugadores.size();i++) {
					if(dorsalJugador==jugadores.get(i).getDorsalJugador()) {
						System.out.println("Introduzca el numero del partido jugado");
						numeroPartido=input.nextInt();
						input.nextLine();
						System.out.println("Introduzca el nombre del equipo rival");
						equipoRival=input.nextLine();
						System.out.println("Introduzca los minutos jugados");
						minutosJugados=input.nextDouble();
						System.out.println("Introduzca los puntos conseguidos");
						puntosConseguidos=input.nextInt();
						System.out.println("Introduzca los rebotes conseguidos");
						rebotes=input.nextInt();
						System.out.println("Introduzca el numero de asistencias conseguidad");
						asistencias=input.nextInt();
						System.out.println("Introduzca el numero de tapones conseguidos");
						tapones=input.nextInt();
						System.out.println("Introduzca la valoracion del jugador");
						valoracionObtenida=input.nextDouble();
						jugadores.get(i).annadirPartidoConvocado(numeroPartido, equipoRival, minutosJugados, puntosConseguidos, rebotes, asistencias, tapones, valoracionObtenida);
					}
				}
				break;
			}
			
			//Mostramos los datos de los partidos jugador del jugador con el dorsal que elijamos
			case 5:{
				System.out.println("Elija el dorsal del jugador que quiere ver sus partidos jugados");
				for(int i=0;i<jugadores.size();i++){
					System.out.print("Nombre: "+jugadores.get(i).getNombre()+"-------------------");
					System.out.print(" Dorsal: "+jugadores.get(i).getDorsalJugador()+"------------------");
					System.out.println(" Posicion: "+jugadores.get(i).getPosicionJugador());
				}
				dorsalJugador=input.nextInt();
				for(int i=0;i<jugadores.size();i++) {
					if(dorsalJugador==jugadores.get(i).getDorsalJugador()) {
						jugadores.get(i).mostrarPartidosJugados();
					}
				}
				break;
			}
			
			//Mostramos el nombre y el dorsal del jugador que más puntos ha conseguido durante temporada
			case 6:{
				int dorsalMasPuntos=0,puntosTemporada,maximosPuntos=0;
				String nombre = null;
				for(int i=0;i<jugadores.size();i++) {
					puntosTemporada=jugadores.get(i).calcularPuntuacionTemporada();
					if(puntosTemporada>maximosPuntos) {
						maximosPuntos=puntosTemporada;
						dorsalMasPuntos=jugadores.get(i).getDorsalJugador();
						nombre=jugadores.get(i).getNombre();
					}
				}
				System.out.println("El jugador que ha conseguido mas puntos ha sido "+nombre+" con el dorsal "+dorsalMasPuntos);
				break;
			}
			
			//Mostramos el nombre y el dorsal del jugador que ha sido convocado mas partidos
			case 7:{
				int partidosConvocado=0,maxPartidosConvocados=0,dorsalJugadorMasPartidos=0;
				String nombre2=null;
				for(int i=0;i<jugadores.size();i++) {
					partidosConvocado=jugadores.get(i).calcularPartidosConvocados();
					if(partidosConvocado>maxPartidosConvocados) {
						maxPartidosConvocados=partidosConvocado;
						dorsalJugadorMasPartidos=jugadores.get(i).getDorsalJugador();
						nombre2=jugadores.get(i).getNombre();
					}
				}
				System.out.println("El jugador con mas partidos convocado ha sido "+nombre2+" con el dorsal "+dorsalJugadorMasPartidos);
				break;
			}
			
			//Elegir un jugador y mostrar sus partidos jugados y la valoracion en cada uno de ellos
			case 8:{
				System.out.println("Elija el dorsal del jugador que quiere ver sus partidos jugados y valoracion en ellos");
				for(int i=0;i<jugadores.size();i++){
					System.out.print("Nombre: "+jugadores.get(i).getNombre()+"-------------------");
					System.out.print(" Dorsal: "+jugadores.get(i).getDorsalJugador()+"-----------------");
					System.out.println(" Posicion: "+jugadores.get(i).getPosicionJugador());
				}
				dorsalJugador=input.nextInt();
				
				for(int i=0;i<jugadores.size();i++) {
					if(dorsalJugador==jugadores.get(i).getDorsalJugador()) {
						jugadores.get(i).mostrarPartidosYpuntuaciones();
					}
				}
				break;
			}
			
			//Elegir un jugador y mostrar su valoracion obtenida mas alta
			case 9:{
				System.out.println("Elija el dorsal del jugador que quiera ver su puntuacion mas alta obtenida durante la temporada");
				for(int i=0;i<jugadores.size();i++){
					System.out.print("Nombre: "+jugadores.get(i).getNombre()+"----------------------");
					System.out.print(" Dorsal: "+jugadores.get(i).getDorsalJugador()+"----------------------");
					System.out.println(" Posicion: "+jugadores.get(i).getPosicionJugador());
				}
				dorsalJugador=input.nextInt();
				
				for(int i=0;i<jugadores.size();i++) {
					if(dorsalJugador==jugadores.get(i).getDorsalJugador()) {
						System.out.print("La mejor valoracion obtenida durante la temporada ha sido ");
						System.out.println(jugadores.get(i).calcularValoracionMasAlta());
					}
				}
				break;
			}
			
			//Salimos del menu y terminamos el programa
			case 10:{
				System.out.println("El programa ha terminado");
			}
			
			}
			
		}while(opcionMenu!=10);
		
	}
}

