
public abstract class Tarjeta {

	//ATRIBUTOS
	protected String NIFCliente;
	protected String PINCliente;
	protected String nombreCliente;
	protected String apellidoCliente;
	
	//GETTERS Y SETTERS
	public String getNIFCliente() {
		return NIFCliente;
	}

	public void setNIF(String NIFCliente) {
		this.NIFCliente = NIFCliente;
	}

	public String getPINCliente() {
		return PINCliente;
	}

	public void setPIN(String PINCliente) {
		this.PINCliente = PINCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	//CONSTRUCTOR
	protected Tarjeta(String NIFCliente, String PINCliente, String nombreCliente, String apellidoCliente) {
		this.NIFCliente = NIFCliente;
		this.PINCliente = PINCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
	}
	
	//CONSTRUCTOR COPIA (EN DESUSO)
	protected Tarjeta(Tarjeta tarjeta1) {
		this.setNIF(tarjeta1.NIFCliente);
		this.setPIN(tarjeta1.PINCliente);
		this.setNombreCliente(tarjeta1.nombreCliente);
		this.setApellidoCliente(tarjeta1.apellidoCliente);
	}
	
	//CONSTRUCTOR VACÍO
	protected Tarjeta() {
		
	}

	
	//MÉTODOS
	public static void mostrarTarjetas() {
		System.out.println("Los atributos son:");
		System.out.println("NIFCliente, PINCliente, nombreCliente, apellidoCliente");
	}
	
	public abstract void retirarDinero();
}
