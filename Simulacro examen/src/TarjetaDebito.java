import java.util.Scanner;

public final class TarjetaDebito extends Tarjeta {
	Scanner entrada = new Scanner (System.in);
	
	//ATRIBUTOS
	Integer saldo;
	
	//GETTERS Y SETTERS
	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

	//CONSTRUCTOR
	public TarjetaDebito(String NIFCliente, String PINCliente, String nombreCliente, String apellidoCliente, Integer saldo) {
		super (NIFCliente, PINCliente, nombreCliente, apellidoCliente);
		this.saldo = saldo;
	}
	
	public TarjetaDebito() {
		// CONSTRUCTOR VACÍO
	}
	
	//CONSTRUCTOR COPIA
	public TarjetaDebito(TarjetaDebito t1) {
		this.setNIF(t1.NIFCliente);
		this.setPIN(t1.PINCliente);
		this.setNombreCliente(t1.nombreCliente);
		this.setApellidoCliente(t1.apellidoCliente);
		this.setSaldo(t1.saldo);
	}

	//MÉTODOS
	@Override
	public void retirarDinero() {
		System.out.println("Su saldo es de "+this.getSaldo()+" €.");
		System.out.println("¿Cuánto dinero desea retirar?");
		Integer cantidad = Integer.parseInt(entrada.nextLine());
		
		if (this.getSaldo() < cantidad || cantidad < 0) {
			System.out.println("Error! No dispone de dinero suficiente o está intentando retirar una cantidad negativa");
		}
		else {
			this.setSaldo(this.getSaldo()-cantidad);
			System.out.println("Se han retirado "+cantidad+" € de su cuenta. Su nuevo saldo es de: "+this.getSaldo()+" €.");
		}
		
	}
	
}