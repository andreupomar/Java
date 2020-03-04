
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

	//MÉTODOS
	@Override
	public void retirarDinero() {
		System.out.println("Puede retirar hasta "+(this.getSaldoDisponible()+this.getCreditoDisponible())+" €.");
		System.out.println("¿Cuánto dinero desea retirar?");
		Integer cantidad = Integer.parseInt(entrada.nextLine());
		
		if ((this.getSaldoDisponible()+this.getCreditoDisponible()) < cantidad || cantidad < 0) {
			System.out.println("Error! No dispone de dinero suficiente o está intentando retirar una cantidad negativa");
		}
		else {
			this.setSaldo(this.getSaldo()-cantidad);
			System.out.println("Se han retirado "+cantidad+" € de su cuenta. Su nuevo saldo es de: "+this.getSaldo()+" €.");
		}
	}
}
