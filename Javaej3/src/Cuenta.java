
public class Cuenta {
	//ATRIBUTOS
	private String nombre;
	private String numCuenta;
	private double tInteres;
	private double saldo;
	
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
	
	
}
