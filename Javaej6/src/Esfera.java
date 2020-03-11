import java.util.Scanner;
import java.lang.Math;

public class Esfera implements poliedro {
	//ATRIBUTO
	protected double radio;
	
	static Scanner entrada = new Scanner (System.in);
	
	//GETTER Y SETTER
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}


	//CONSTRUCTOR
	public Esfera() {
		System.out.println("Introduzca el radio de la esfera: ");
		this.radio = Double.parseDouble(entrada.nextLine());
	}

	public void imprimirCaracter�sticas() {
		System.out.println("La esfera tiene un radio de "+this.radio+" unidades.");
	}
	public void calcular�rea() {
		double area = (4*Math.PI*Math.pow(this.radio, 2));
		imprimirCaracter�sticas();
		System.out.println("El �rea es: "+area+" unidades al cuadrado");
	}
	
	public void calcularVolumen() {
		double volumen = ((4/3)*Math.PI*Math.pow(this.radio, 2));
		imprimirCaracter�sticas();
		System.out.println("El volumen es: "+volumen+" unidades c�bicas");
	}
}
