package PracticasEclipseAlgoritmos.Algoritmos;

public class Recorrer0 {

	//Recorre los 0 al inicio
	public static void main(String[] args) {
		int[] array = {2,3,5,8,0,21,0,55,0,144};
		int aux=0; 
		int position=0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]==0) {				
				aux= array[position];
				array[position] = array[i];
				array[i]=aux;
				position++;
			}			
		}		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
