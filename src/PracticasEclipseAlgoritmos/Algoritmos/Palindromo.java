package PracticasEclipseAlgoritmos.Algoritmos;

public class Palindromo {
	public static void main(String[] args) {
		
		System.out.println(esPalindromo("Ana"));
	}
	
	public static boolean esPalindromo(String palabra)  {
		palabra = palabra.toLowerCase();
		
		for(int i=0, j=palabra.length()-1; i<=j; i++, j--) {
			if(palabra.charAt(i)!= palabra.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
