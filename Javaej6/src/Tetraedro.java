import java.util.Scanner;
import java.lang.Math;

public class Tetraedro implements poliedro {
//Asumiremos que se trata de un poliedro compuesto por tri�ngulos equil�teros.
	protected Double arista;

	static Scanner entrada = new Scanner (System.in);
	
	//GETTERS Y SETTERS
	public Double getArista() {
		return arista;
	}

	public void setArista(Double arista) {
		this.arista = arista;
	}

	//CONSTRUCTOR
	public Tetraedro() {
		System.out.println("Introduzca la longitud de una de las aristas del tetraedro regular: ");
		this.arista = Double.parseDouble(entrada.nextLine());
	} 
	
	public void calcular�rea() {
		double area = ((Math.sqrt(3)/4)*Math.pow(this.arista, 2))*4; //Asumo que el c�lculo es corecto??
		imprimirCaracter�sticas();
		System.out.println("El �rea de un tetraedro de arista "+this.arista+" es "+area+" unidades cuadradas");
	}
	
	public void calcularVolumen() {
		double volumen = ((Math.sqrt(2)/12)*(Math.pow(this.arista, 3))); //Nuevamente, creo que la f�rmula es correcta.
		imprimirCaracter�sticas();
		System.out.println("Tiene un volumen de "+volumen+" unidades c�bicas");
		
	}
	
	public void imprimirCaracter�sticas() {
		System.out.println("El tetraedro tiene una arista de longitud "+this.arista);
	}

}
