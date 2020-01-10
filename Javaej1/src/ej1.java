import java.util.Scanner;

public class ej1 {

	public void cinconums() {
		System.out.println ("Introduzca cinco números, separados por intro:");
		Scanner entrada = new Scanner (System.in);
		
		int i;
		int[] nums = new int[5];
		
		for (i = 0; i < 5; i++) {
			int numer = entrada.nextInt();
			nums[i] = numer;
		}
		
		System.out.println ("Los números introducidos son: "+nums[0]+", "+nums[1]+", "+nums[2]+", "+nums[3]+" y "+nums[4]);
	
		entrada.close();
	}

}
