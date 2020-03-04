
public final class TarjetaDebito extends Tarjeta {

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

}
