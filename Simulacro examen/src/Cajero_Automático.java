import java.util.ArrayList;

public class Cajero_Automático {
	//ATRIBUTOS
	private String idCajero_ultimo;
	private String idCajero;
	private Integer[][] lista_de_billetes = {{500, 10}, {200, 0}, {100,0}, {50, 30}, {20, 0}, {10, 20}, {5, 30}};
	private ArrayList<Tarjeta> lista_de_tarjetas; //Aquí almacenamos la lista de tarjetas admitidas en el cajero

	//GETTERS Y SETTERS 
	public String getIdCajero_ultimo() {
		return idCajero_ultimo;
	}

	public void setIdCajero_ultimo(String idCajero_ultimo) {
		this.idCajero_ultimo = idCajero_ultimo;
	}

	public String getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(String idCajero) {
		this.idCajero = idCajero;
	}

	public Integer[][] getLista_de_billetes() {
		return lista_de_billetes;
	}

	public void setLista_de_billetes(Integer[][] lista_de_billetes) {
		this.lista_de_billetes = lista_de_billetes;
	}

	public ArrayList<Tarjeta> getLista_de_tarjetas() {
		return lista_de_tarjetas;
	}

	public void setLista_de_tarjetas(ArrayList<Tarjeta> lista_de_tarjetas) {
		this.lista_de_tarjetas = lista_de_tarjetas;
	}

	
}
