package PracticasEclipseAlgoritmos.Algoritmos;

class PalindNums {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

	//validar si es palindromo
    public static boolean isPalindrome(int x) {
        String[] digitos = String.valueOf(x).split("");
        for(int i=0, j=digitos.length-1; i<=j; i++, j--) {
			if(!digitos[i].equals(digitos[j])) {
				return false;
			}
		}
		return true;
	}
}

