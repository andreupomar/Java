import java.util.ArrayList;
import java.util.Scanner;

public class Cajero_main {
	public static void main(String[] args) {
		
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
