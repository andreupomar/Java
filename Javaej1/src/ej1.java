import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		System.out.println ("Introduzca cinco n�meros, separados por intro:");
		Scanner entrada = new Scanner (System.in);
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		int num4 = entrada.nextInt();
		int num5 = entrada.nextInt();
		
		System.out.println ("Los n�meros introducidos son: "+num1+", "+num2+", "+num3+", "+num4+" y "+num5);
		
	}

}