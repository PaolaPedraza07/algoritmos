package PracticasEclipseAlgoritmos.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class BetterPractice {

	public static void main(String[] args) {
		List<String> courseList = new ArrayList();
		courseList.add("Java");
		courseList.add("Front");
		courseList.add("Back");
		courseList.add("JavaScript");
		
		Stream<String> courseList2 = courseList.stream();
				
		courseList2.map(course -> course+"!!")
		.filter(course -> course.contains("Java"))
		.forEach(System.out::println);
		
		
		///////////////////////////////////////////////////////////
		/*
		Stream<String> coursesStream = Stream.of("Java", "FrontEnd", "BackEnd", "FullStack", "JavaScript");
		
		
		Stream<Integer> courseLenghtStream = coursesStream.map(course -> course.length());
		courseLenghtStream.forEach(System.out::println);
		
		Optional<Integer> longest = courseLenghtStream.max((x, y)-> x-y);
		System.out.println(longest.get());

		Stream<String> addingSigno = coursesStream.map(course -> course+"!");
		addingSigno.forEach(System.out::println);
		
		Stream<String> justJavaCourses = addingSigno.filter(courses -> courses.contains("Java"));
		justJavaCourses.forEach(System.out::println);
		*/	
	
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