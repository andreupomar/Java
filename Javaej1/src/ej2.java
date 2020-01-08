import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		System.out.println ("Introduzca cinco números, separados por intro:");
		Scanner entrada = new Scanner (System.in);
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		int num4 = entrada.nextInt();
		int num5 = entrada.nextInt();
		
		System.out.println ("Los números introducidos son: "+num5+", "+num4+", "+num3+", "+num2+" y "+num1);
		
	}

}
