package PracticasEclipseAlgoritmos.trainning;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class main {
	public static void main(String[] args) {
		
		//chartAt
		double studentCalif = 3.4;
		String name = "Paola";
		char firstLetter = name.charAt(4);
		System.out.println(firstLetter);
		
		//Scanner
		System.out.println("Por que quieres cambiar la calif?");
		Scanner input = new Scanner(System.in);
		
		studentCalif = input.nextDouble();
		
		System.out.println("lanew calif es: "+studentCalif);
		
		//
		
		MyClass<Integer, Double> ob1 = new MyClass<>(10, 12.11);
		
		ob1.showType();
		
		//treeSet
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(200);
		numbers.add(500);
		
		NavigableSet<Integer> numeros = new TreeSet<Integer>(numbers);
		numeros.stream()
		.forEach(System.out::print);
		//-----
		
		List <Rooms> laps = new ArrayList<>();
		laps.add(new Rooms("Dell", 12, 2));
		
		
	}
}
