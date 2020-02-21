
public class comercial extends empleado {

	//ATRIBUTOS
	protected Integer ventasRealizadas;
	protected Integer comisión;
	
	//GETTERS Y SETTERS
	public Integer getVentasRealizadas() {
		return ventasRealizadas;
	}



	public void setVentasRealizadas(Integer ventasRealizadas) {
		this.ventasRealizadas = ventasRealizadas;
	}



	public Integer getComisión() {
		return comisión;
	}



	public void setComisión(Integer comisión) {
		this.comisión = comisión;
	}


	//CONSTRUCTOR
	public comercial(String nombre, String apellido1, String apellido2, String nif, Integer edad, Integer salario, Integer ventasRealizadas, Integer comisión) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
		this.ventasRealizadas = ventasRealizadas;
		this.comisión = comisión;
	}
	
	
	
}
