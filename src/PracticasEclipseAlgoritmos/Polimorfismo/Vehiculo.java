package PracticasEclipseAlgoritmos.Polimorfismo;

public class Vehiculo {
	private String marca;
	private String año;
	
	public Vehiculo(String marca, String año) {
		this.marca = marca;
		this.año = año;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}
	

	public String mostrarDatos() {
		return "La marca es: "+marca+" y el a�o es: "+año;
	}

}
