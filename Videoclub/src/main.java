import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pelicula> Catalogo = new ArrayList<Pelicula>(); //Nuestro cat�logo de pel�culas se almacena aqu�
		boolean menu = true;
		int contador = 0; //Utilizaremos esta variable para asignar IDs a las pel�culas nuevas
		int copias = 0; //Cantidad total de copias
		Scanner entrada = new Scanner (System.in);
		
		while (menu == true) {
			System.out.println("Sistema de gesti�n de videoclub");
			System.out.println("1) A�adir pel�culas");
			System.out.println("2) Reservar pel�culas");
			System.out.println("3) Listar cat�logo");
			System.out.println("4) Buscar pel�cula");
			System.out.println("*) Salir");
			
			int opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				Pelicula nueva = new Pelicula();
				nueva.a�adirPel�cula(contador, copias);
				if (nueva.isDisponibilidad() == true ) { //Comprobamos si A�adirPel�cula() ha a�adido una pel�cula bien
					Catalogo.add(nueva); //Y la a�adimos al array
					contador ++; //Aumentamos el contador para futuros IDs
				}
				break;
			
			case 2: 
				Pelicula.listarCat�logo(Catalogo);
				if (Pelicula.listarCat�logo(Catalogo) == true) {
					
				}
				break;
				
			case 3:
				Pelicula.listarCat�logo(Catalogo);
				break;
			}
			
		}
	}

}
