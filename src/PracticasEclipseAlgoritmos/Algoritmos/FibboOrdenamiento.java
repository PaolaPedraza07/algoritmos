package PracticasEclipseAlgoritmos.Algoritmos;

public class FibboOrdenamiento {
	public static void main(String[] args) {
		//Pares primero impares despues
		int[] fibbo = {2,3,5,8,13,21,34,55,89,144};
		int aux=0; 
		int position=0;
		
		for(int i=0; i<fibbo.length; i++) {
			if(fibbo[i]%2==0) {				
				aux= fibbo[position];
				fibbo[position] = fibbo[i];
				fibbo[i]=aux;
				position++;
			}			
		}		
		for(int i=0; i<fibbo.length; i++) {
			System.out.println(fibbo[i]);
		}
	}
}
