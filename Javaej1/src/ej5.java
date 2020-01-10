import java.util.Scanner;


public class ej5 {

	public static void main(String[] args) {
		
		int[] tab1 = new int [10];
		int[] tab2 = new int [10];
		int[] tab3 = new int [20];
		
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
		
		for (i = 0; i < 20; i++) { // Ni puta idea de por qué i/2, que a veces da decimales, me funciona
			if (i%2==0) { // pero aquí estamos ¯\_(ツ)_/¯
				tab3[i] = tab1[i/2];
			}
			else {
				tab3[i] = tab2[i/2];
			}
		}
		
		for (i = 0; i < 20; i++) {
			System.out.println(tab3[i]);
		}
		
		
		
	}

}
