import java.util.Scanner;


public class ej5 {

	public static void main(String[] args) {
		
		int[] tab1 = new int [10];
		int[] tab2 = new int [10];
		
		int i = 0;
		
		for (i = 0; i < 10; i++) {
			System.out.println ("Introduzca diez números para el array 1, separados por intro:");
			Scanner entrada = new Scanner (System.in);
			tab1[i] = entrada.nextInt();
		}
		
		for (i = 0; i < 10; i++) {
			System.out.println ("Introduzca diez números para el array 2, separados por intro:");
			Scanner entrada = new Scanner (System.in);
			tab2[i] = entrada.nextInt();
		}
		
		for (i = 0; i < 10; i++) {
			System.out.println (tab1[i]+" "+tab2[i]);
		}
		
		
		
	}

}
