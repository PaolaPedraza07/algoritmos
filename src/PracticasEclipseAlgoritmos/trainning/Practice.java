package PracticasEclipseAlgoritmos.trainning;

import java.util.Scanner;

public class Practice {
	
	static int numOf = 3;

	public static void main(String[] args) {
		
		
		
		String question = "�Cuantos a�os cree que tiene Paola?";
		String choice1 = "quince";
		String choice2 = "veintidos";
		String choice3 = "veinte";
		Scanner input = new Scanner(System.in);
		
		String correctAnswer = choice3;
		
		System.out.println(question);
		System.out.println("Elije una de las siguientes choices: "+"\n"+choice1+"\n"+choice2+"\n"+choice3);
		String answer = input.next();
		
		if(correctAnswer.equals(answer.toLowerCase())) {
			System.out.println("Congrats that the correct answer");
		}else {
			System.out.println("Incorrect");
		}
		
		System.out.println(Practice.numOf);
		
		
		
		double x= 3.9999;
		long y = Math.round(x);
		System.out.println(y);
		
		
		
		
		
		
	}

}
