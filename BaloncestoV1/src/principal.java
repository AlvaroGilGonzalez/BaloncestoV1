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
		
		//Añadimos datos de partidos a los distintos jugadores
		jugadores.get(0).annadirPartidoConvocado(1, null, 0, 0, 0, 0, 0, 0);
		jugadores.get(1).annadirPartidoConvocado(2, "unicaja", 1, 2, 3, 4, 5, 6);
		jugadores.get(2).annadirPartidoConvocado(3, "madrid", 5, 6, 7, 8, 9, 10);
		
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
		
		//Datos necesarios para implementar las opciones V2
		
		
		//Entramos al menu y no salimos hasta introducir el numero 6
		do {
			System.out.println("1.Introducir un nuevo socio");
			System.out.println("2.Introducir un nuevo Trabajador");
			System.out.println("3.Introducir un nuevo Jugador");
			System.out.println("4.Añadir informacion del partido de algun jugador");
			System.out.println("5.Mostrar los partidos que ha jugado un jugador");
			System.out.println("6.Salir del programa");
			
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
					System.out.print("Nombre: "+jugadores.get(i).getNombre()+"-----");
					System.out.print(" Dorsal: "+jugadores.get(i).getDorsalJugador()+"----");
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
					System.out.print("Nombre: "+jugadores.get(i).getNombre()+"-----");
					System.out.print(" Dorsal: "+jugadores.get(i).getDorsalJugador()+"----");
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
			
			//Salimos del menu y terminamos el programa
			case 6:{
				System.out.println("El programa ha terminado");
			}
			
			}
			
		}while(opcionMenu!=6);
		
	}
}

