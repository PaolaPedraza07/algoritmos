package PracticasEclipseAlgoritmos.Herencia;

public class Estudiante extends Persona{

	int nota;
	public Estudiante(String nombre, String apellido, int nota) {
		super(nombre, apellido);
		this.nota=nota;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre es: "+getNombre()+" "+getApellido()+" la nota es: "+nota);
	}
	
}
