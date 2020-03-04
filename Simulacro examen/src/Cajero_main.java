import java.util.ArrayList;
import java.util.Scanner;

public class Cajero_main {
	
	public static void comprobarCuenta(ArrayList<Cajero_Autom�tico> listaCajeros, ArrayList<Tarjeta> listaTarjetas) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Por favor, introduzca su NIF:");
		String inputNif = entrada.nextLine();
		boolean encontrado = false;
		Integer iteraciones = 0; //Utilizaremos para saber en qu� posici�n de la lista estamos
		
		while (encontrado == false && iteraciones < listaTarjetas.size()) { //Iteramos hasta encontrar el NIF o terminar la lista
			if (listaTarjetas.get(iteraciones).getNIFCliente() == inputNif) {
				encontrado = true;
			}
			else {
				iteraciones ++;
			}
		}
		
		if (encontrado == false) { //En caso de no encontrar el NIF
			System.out.println("Lo sentimos, no se ha encontrado la cuenta.");
		}
		else {
			System.out.println("Introduzca su PIN: ");
			String inputPIN = entrada.nextLine();
			
			if (inputPIN != listaTarjetas.get(iteraciones).getPINCliente()) { //En caso de introducir un PIN incorrecto
				System.out.println("El PIN introducido es incorrecto");
			}
			else {
				listaTarjetas.get(iteraciones).retirarDinero();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		//Contendr� todos los cajeros autom�ticos, asumiendo que queremos a�adir la posibilidad de tener varios
		ArrayList<Cajero_Autom�tico> listaCajeros = new ArrayList<Cajero_Autom�tico>();
		
		//Aqu� almacenaremos todas las tarjetas
		ArrayList<Tarjeta> listaTarjetas = new ArrayList<Tarjeta>();
		
		//MEN�
		String opcion = "0";
		Scanner entrada = new Scanner (System.in);
		while (opcion != "2") {
			System.out.println("Bienvenido al cajero autom�tico");
			System.out.println("1 - Retirar dinero");
			System.out.println("2 - Salir");
			opcion = entrada.nextLine();
			
			mostrarCajero();
			retirarDinero();
			
		}

	}

}
