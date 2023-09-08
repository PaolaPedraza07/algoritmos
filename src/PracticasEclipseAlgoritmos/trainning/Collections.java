package PracticasEclipseAlgoritmos.trainning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collections {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Paola");
		
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("Paola", 22);
		System.out.println(mapa.keySet());
		
		List<String> lList = new LinkedList<>();
		lList.add("Pao");
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(5);
		listaNumeros.add(7);
		
		System.out.println(lista);
		System.out.println(mapa.get("Paola"));
		System.out.println(lList);
		
		
		int [] numbers = new int[0];
		int[] numeros = {1,3,3};
	}
}
