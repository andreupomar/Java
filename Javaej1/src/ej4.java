import java.util.Scanner;

public class ej4 {

	public void reverso() {
		
		Scanner entrada = new Scanner (System.in);
		
		int[] nums = new int [10];
		int i = 0;
		
		for (i = 0; i < 10; i++) {
			System.out.println ("Introduzca diez números, separados por intro:");
			nums[i] = entrada.nextInt();

		}
		
		for (i = 0; i < 5; i++) {
			System.out.println(nums[i]);
			System.out.println(nums[9-i]);
		}
		entrada.close();
	}
}