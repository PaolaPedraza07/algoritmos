package PracticasEclipseAlgoritmos.Threads;

public class Main {

	public static void main(String[] args) {
		Thread hilo = new Proceso("Proceso 1");
		Thread hilo2 = new Proceso("Proceso 2");
		hilo.start();
		hilo2.start();
		
		
	}

}
