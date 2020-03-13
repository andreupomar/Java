import java.util.Scanner;
import java.lang.Math;

public class Cubo implements poliedro {
	//ATRIBUTO
	protected double arista;
	
	static Scanner entrada = new Scanner (System.in);

	public Cubo() {
		System.out.println("Introduzca la longitud de una de las aristas:");
		this.arista = Double.parseDouble(entrada.nextLine());
	}
	
	public void calcular�rea() {
		double area = (this.arista*2)*6;
		imprimirCaracter�sticas();
		System.out.println("El �rea es "+area+" unidades cuadradas");
	}
	
	public void calcularVolumen() {
		double volumen = Math.pow(this.arista, 3);
		imprimirCaracter�sticas();
		System.out.println("El volumen es "+volumen+" unidades cubicas");
	}
	
	public void imprimirCaracter�sticas() {
		System.out.println("El cubo tiene una arista de "+this.arista);
	}

}
