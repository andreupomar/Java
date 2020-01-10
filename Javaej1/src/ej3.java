import java.util.Scanner;

public class ej3 {

	public void medias() {
		
		int[] positivos = new int[5];
		int[] negativos = new int[5];
		int[] ceros = new int [5];

		int numpositivos = 0;
		int totalpositivos = 0;
		int numnegativos = 0;
		int totalnegativos = 0;
		int numceros = 0;
		
		int i = 0;
		
		for (i = 0; i < 5; i++) {
			System.out.println ("Introduzca cinco números, separados por intro:");
			Scanner entrada = new Scanner (System.in);
			int numero = entrada.nextInt();
			entrada.close();
			
			if (numero > 0) {
				positivos[i] = numero;
			}
			else if (numero < 0) {
				negativos[i] = numero;
			}
			else {
				ceros[i] = 1;
			}
		}

		for (i = 0; i < 5; i++) {
			if (positivos[i] != 0) {
				numpositivos ++;
				totalpositivos += positivos[i];
			}
			if (negativos[i] != 0) {
				numnegativos ++;
				totalnegativos += negativos[i];
			}
			if (ceros[i] != 0) {
				numceros ++;
			}
		}
		
		System.out.println ("La media de los positivos es: "+totalpositivos/numpositivos);
		System.out.println ("La media de los negativos es: "+totalnegativos/numnegativos);
		System.out.println ("Hay un total de "+numceros+" ceros");
		
		for (i = 0; i < 5; i++) {
			if (negativos[i] != 0) {
				numnegativos ++;
				totalnegativos += negativos[i];
			}
		}
		

		
	}

}
