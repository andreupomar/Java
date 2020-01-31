import java.util.Scanner;

public class Cuenta {
	//ATRIBUTOS
	private String nombre;
	private String numCuenta;
	private double tInteres;
	private double saldo;
	
	static Scanner entrada = new Scanner (System.in);
	
	public Cuenta(String nombre, String numCuenta, double tInteres, double saldo) { //CONSTRUCTOR
		this.setNombre(nombre);
		this.setNumCuenta(numCuenta);
		this.settInteres(tInteres);
		this.setSaldo(saldo);
	}

	
	public Cuenta(Cuenta cuenta1) { // CONSTRUCTOR COPIA
		this.setNombre(cuenta1.nombre);
		this.setNumCuenta(cuenta1.numCuenta);
		this.settInteres(cuenta1.tInteres);
		this.setSaldo(cuenta1.saldo);
	}
	
	public Cuenta() {
		
	}


	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double gettInteres() {
		return tInteres;
	}

	public void settInteres(double tInteres) {
		this.tInteres = tInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void crearCuenta() {
		System.out.println("Introduzca un nombre para su cuenta: ");
		this.setNombre(entrada.nextLine());
		System.out.println("Introduzca un número de cuenta: ");
		this.setNumCuenta(entrada.nextLine());
		System.out.println("Introduzca un tipo de interés: ");
		this.settInteres(entrada.nextDouble());
		System.out.println("Introduzca un saldo inicial: ");
		this.setSaldo(entrada.nextDouble());
	}
	
	public boolean ingresarDinero() { //INGRESAR DINERO
		boolean exito = false;
		System.out.println("Introduzca la cantidad de dinero a ingresar");
		double cantidad = entrada.nextDouble();
		
		if (cantidad < 0) {
			System.out.println("No es posible introducir una cantidad negativa de dinero");
		}
		else {
			this.setSaldo(saldo+cantidad);
			exito = true;
		}
		return exito;
	}
	
	public boolean retirarDinero() { //RETIRAR DINERO DE LA CUENTA
		boolean exito = false;
		System.out.println("Introduzca la cantidad de dinero a retirar");
		double cantidad = entrada.nextDouble();
		
		if (cantidad < 0) {
			System.out.println("No es posible retirar una cantidad negativa de dinero");
		}
		else if (this.getSaldo()<cantidad) {
			System.out.println("No dispone de suficiente saldo para realizar esta operación.");
		}
		else {
			this.setSaldo(saldo-cantidad);
			exito = true;
		}
		
		return exito;
	}

}