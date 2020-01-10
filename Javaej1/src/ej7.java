import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		ej1 e1 = new ej1();
		ej2 e2 = new ej2();
		ej3 e3 = new ej3();
		ej4 e4 = new ej4();
		ej5 e5 = new ej5();
		ej6 e6 = new ej6();
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduzca un número del 1 al 6 para lanzar el ejercicio correspondiente");
		
		int opcion = entrada.nextInt();
		
		entrada.close();
		
		switch (opcion) {
		
		case 1:
			e1.cinconums();
			break;
		case 2:
			e2.invertidos();
			break;
		case 3:
			e3.medias();
			break;
		case 4:
			e4.reverso();
			break;
		case 5:
			e5.alternar();
			break;
		case 6:
			e6.undostres();
			break;
		}

	}

}
