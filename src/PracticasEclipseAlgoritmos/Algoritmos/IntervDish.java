package PracticasEclipseAlgoritmos.Algoritmos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class IntervDish {

	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(
				new Dish("pork", 800),
				new Dish("season fruit", 350),
				new Dish("rice", 200),
				new Dish("prawns", 150)
				);
		
		
		List<String> dishes2 = menu.stream().filter(dish -> dish.calory < 400).map(dish -> dish.name).collect(Collectors.toList());
		dishes2.forEach(d->{
			System.out.println(d);
		});
		
	}
}

class Dish{
	String name;
	int calory;
	
	public Dish(String name, int calory) {
		super();
		this.name = name;
		this.calory = calory;
	}
}
