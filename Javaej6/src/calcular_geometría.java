import java.util.ArrayList;
import java.util.Scanner;


public class calcular_geometría {
	
	public static Integer menu() throws fueraDeRangoException, NumberFormatException {
		Scanner entrada = new Scanner (System.in);
		Integer opcion = 0; //Variable para el input del usuario. Utilizo un integer para poder implementar excepciones
		
		System.out.println("Programa de cálculo poliédrico");
		System.out.println("");
		System.out.println("1 - Generar figura ");
		System.out.println("2 - Calcular figura");
		System.out.println("0 - Salir");
		
		opcion =  Integer.parseInt(entrada.nextLine());
			
			if (opcion > 2 || opcion < 0) {
				throw new fueraDeRangoException();
			}
			else {
				
			return opcion;
			}
	}
	
		
	
	public static void main(String[] args) {
		
		Integer opcion = 0;
		
		try {
			opcion = menu();
		} catch (fueraDeRangoException e){
			opcion = menu(); //La segunda vez va a petar. El propósito del ejercicio es practicar.
		} catch (NumberFormatException e) {
			System.out.println("El valor introducido no es un número.");
			opcion = menu();
		} finally {
			switch (opcion) {
			case 1:
				Tetraedro t1 = new Tetraedro();
				t1.calcularVolumen();
				t1.calcularÁrea();
			}
		}
		
	}

}
