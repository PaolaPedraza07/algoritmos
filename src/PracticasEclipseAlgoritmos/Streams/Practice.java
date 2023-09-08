package PracticasEclipseAlgoritmos.Streams;

import java.util.ArrayList;
import java.util.List;

public class Practice {

	private List<String> lista;
	private List<String> numeros;
	
	public Practice() {
		lista = new ArrayList<>();
		lista.add("Paola");
		lista.add("Andrea");
		lista.add("Diego");
		lista.add("Paola2");
		
		numeros = new ArrayList<String>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
	}
	
	public void filtrar() {
		lista.stream().filter(x -> x.startsWith("P")).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		Practice app = new Practice();
		app.filtrar();
		
	}
}
