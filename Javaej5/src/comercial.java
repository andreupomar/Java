
final public class comercial extends empleado {

	//ATRIBUTOS
	private Integer ventasRealizadas;
	private Integer comisión;
	
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
	
	//CONSTRUCTOR COPIA (EN DESUSO)
	public comercial(comercial comercial1) {
		this.setNombre(comercial1.nombre);
		this.setApellido1(comercial1.apellido1);
		this.setApellido2(comercial1.apellido2);
		this.setNif(comercial1.nif);
		this.setEdad(comercial1.edad);
		this.setSalario(comercial1.salario);
	}
	
	
	
}
