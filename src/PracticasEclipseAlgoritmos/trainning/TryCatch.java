package PracticasEclipseAlgoritmos.trainning;

import java.io.*;

public class TryCatch {

	public static void main(String[] args) {
		
		String s = null;
		try {
			var sub = s.substring(1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("El programa contin�a");
		System.out.println("El programa contin�a");
		System.out.println(TestStatic.val);
		
		//file
		var file = new File("hello.txt");
		System.out.println("File exist: "+ file.exists());
		
		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			var text = br.readLine();
			System.out.println(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
