package PracticasEclipseAlgoritmos.trainning;

public class For {
	
	public static void main(String[] args) {
		
		String[] months = {"Enero", "Febrero", "Marzo", "Abril"};
		
		//Opcion 1
		for(int i=0; i<months.length; i++) {
			System.out.println(months[i]);
		}
		
		//Opcion 2
		for(String month : months) {
			System.out.println(month);
		}
		
	}
}
