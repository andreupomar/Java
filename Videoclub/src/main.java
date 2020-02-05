import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pelicula> Catalogo = new ArrayList<Pelicula>(); //Nuestro catálogo de películas se almacena aquí
		boolean menu = true;
		int contador = 0; //Utilizaremos esta variable para asignar IDs a las películas nuevas
		int copias = 0; //Cantidad total de copias
		Scanner entrada = new Scanner (System.in);
		
		while (menu == true) {
			System.out.println("Sistema de gestión de videoclub");
			System.out.println("1) Añadir películas");
			System.out.println("2) Reservar películas");
			System.out.println("3) Listar catálogo");
			System.out.println("4) Buscar película");
			System.out.println("*) Salir");
			
			int opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				Pelicula nueva = new Pelicula();
				nueva.añadirPelícula(contador, copias);
				if (nueva.isDisponibilidad() == true ) { //Comprobamos si AñadirPelícula() ha añadido una película bien
					Catalogo.add(nueva); //Y la añadimos al array
					contador ++; //Aumentamos el contador para futuros IDs
				}
				break;
			
			case 2: 
				Pelicula.listarCatálogo(Catalogo);
				if (Pelicula.listarCatálogo(Catalogo) == true) {
					
				}
				break;
				
			case 3:
				Pelicula.listarCatálogo(Catalogo);
				break;
			}
			
		}
	}

}
