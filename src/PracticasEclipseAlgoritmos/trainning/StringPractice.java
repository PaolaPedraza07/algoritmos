package PracticasEclipseAlgoritmos.trainning;

import java.time.LocalDateTime;
import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		
	//String format
		var item = "shirt";
		var size = "M";
		var price = 14.99;
		var color = "red";
		
		var template = "Clothing item: %s, size %s, color %s, $%.2f";
		var itemString = String.format(template, item, size, color, price);
		System.out.println(itemString);
		 
	//equals
		String h1 = "Hello";
		String h2 = "HELLO";
		
		if(h1.equalsIgnoreCase(h2)) {
			System.out.println("They match!");
		}else {
			System.out.println("They don't match!");
		}
		
	//String to double
		String hi = "52.2";
		double hi2 = Double.parseDouble(hi);
		System.out.println(hi2);
		
		
	//String to char[]
		String hello = "Hello";
		char ch[] = hello.toCharArray();
		for(int i =0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
	//Unificar string
		String p1 = 22 + " numeros";
		System.out.println(p1);
		
	//Lenght, position, substring
		String s1= "Welcome to Mexico";
		System.out.println("The lenght is: "+ s1.length());
		
		int position = s1.indexOf("Mexico");
		System.out.println("The position is: "+ position);
		
		String sub = s1.substring(11);
		System.out.println(sub);
		
	//Sanner
		System.out.println("Enter the first number");
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble(); 
		System.out.println("Enter the second number");
		double n2 = input.nextDouble();
		System.out.println(n1/n2);
		
	//Date Time
		var now = LocalDateTime.now();
		System.out.println(now);
		var monthNumber = now.getMonthValue();
		System.out.println(monthNumber);

	}

}
