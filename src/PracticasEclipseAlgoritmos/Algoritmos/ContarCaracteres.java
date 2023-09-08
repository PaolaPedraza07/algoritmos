package PracticasEclipseAlgoritmos.Algoritmos;

public class ContarCaracteres {

	public static void main(String[] args) {
		String p1 ="Paola";
		char caracter;
		int contador=0;
		p1.toLowerCase();
		char[] arrayCadena = p1.toCharArray();
		for(int i=0; i<arrayCadena.length; i++) {
			caracter=arrayCadena[i];
			for(int j=0; j<arrayCadena.length; j++) {
				if(arrayCadena[j]==caracter) {
					contador++;
				}
			}
			System.out.println(arrayCadena[i]+" "+contador);
			contador=0;
		}
	}
}
