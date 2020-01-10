
public class ej6 {

	public static void main(String[] args) {
		
		String[] ser1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		String[] ser2 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
		String[] resultado = new String[24];
		
		int i = 0;
		int contador1 = 0;
		int contador2 = 0;
		boolean turno = false;
		int metronomo = 0;
		
		for (i = 0; i < 24; i++) {
			if (turno == false) {
				resultado[i] = ser1[contador1];
				contador1 ++;
				metronomo ++;
				}
			
			else{
				resultado[i] = ser2[contador2];
				contador2 ++;
				metronomo ++;	
			}
			
			if (metronomo == 3) {
				turno = !turno;
				metronomo = 0;
			}
			
			System.out.println(resultado[i]);
	}

}
}
