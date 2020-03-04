
public final class TarjetaCredito extends Tarjeta {

	//ATRIBUTOS
	Integer saldoDisponible;
	Integer creditoDisponible;
	
	//GETTERS Y SETTERS
	public Integer getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(Integer saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public Integer getCreditoDisponible() {
		return creditoDisponible;
	}

	public void setCreditoDisponible(Integer creditoDisponible) {
		this.creditoDisponible = creditoDisponible;
	}
	
	//CONSTRUCTOR
	public TarjetaCredito(String NIFCliente, String PINCliente, String nombreCliente, String apellidoCliente, Integer creditoDisponible, Integer saldoDisponible) {
		super (NIFCliente, PINCliente, nombreCliente, apellidoCliente);
		this.creditoDisponible = creditoDisponible;
		this.saldoDisponible = saldoDisponible;
	}
	
	//CONSTRUCTOR COPIA
	public TarjetaCredito(TarjetaCredito t1) {
		this.setNIF(t1.NIFCliente);
		this.setPIN(t1.PINCliente);
		this.setNombreCliente(t1.nombreCliente);
		this.setApellidoCliente(t1.apellidoCliente);
		this.setSaldoDisponible(t1.saldoDisponible);
		this.setCreditoDisponible(t1.creditoDisponible);
	}
	
	public TarjetaCredito() {
		// CONSTRUCTOR VACÍO
	}

}
