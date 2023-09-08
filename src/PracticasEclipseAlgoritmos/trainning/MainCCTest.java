package PracticasEclipseAlgoritmos.trainning;

import static org.junit.Assert.*;

import org.junit.Test;


public class MainCCTest {

	Person p1 = new Person(55.3, 22);
	
	@Test
	public void test() {
		String response = p1.toString();
		
		assertEquals("Person{" +
                "height=" + 55.3 +
                ", age=" + 22 +
                "}", response);
	}

}
