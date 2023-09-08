package PracticasEclipseAlgoritmos.Algoritmos;


public class PalindromoStringBuilder {
	
	public static void main(String[] args) {
		String s1 = "civic";
		String s2 = "Ana";
		String s3 = "Hola";
		
		System.out.println(palindromeChecker(s3));	
	}

	public static boolean palindromeChecker(String original) {
		String sinMayus = original.toLowerCase();
		StringBuilder revertido = new StringBuilder();
		
		for(int i = sinMayus.length()-1; i>=0; i--) {
			revertido.append(sinMayus.charAt(i));
		}
		
		return sinMayus.equals(revertido.toString());
	}
	

	
}
