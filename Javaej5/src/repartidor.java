
final public class repartidor extends empleado {
	//ATRIBUTOS
	private Integer horasTrabajadas;
	private String zona;
	
	//GETTERS Y SETTERS
	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}

	//CONSTRUCTOR
	public repartidor(String nombre, String apellido1, String apellido2, String nif, Integer edad, Integer salario, Integer horasTrabajadas, String zona) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
		this.horasTrabajadas = horasTrabajadas;
		this.zona = zona;
	}

}
