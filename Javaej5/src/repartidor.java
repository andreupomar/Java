
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

	//CONSTRUCTOR COPIA (EN DESUSO)
		public repartidor(repartidor repartidor1) {
			this.setNombre(repartidor1.nombre);
			this.setApellido1(repartidor1.apellido1);
			this.setApellido2(repartidor1.apellido2);
			this.setNif(repartidor1.nif);
			this.setEdad(repartidor1.edad);
			this.setSalario(repartidor1.salario);
			this.setHorasTrabajadas(repartidor1.horasTrabajadas);
			this.setZona(repartidor1.zona);
		}
}
