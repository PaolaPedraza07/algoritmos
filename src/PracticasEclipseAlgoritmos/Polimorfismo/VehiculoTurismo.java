package PracticasEclipseAlgoritmos.Polimorfismo;

public class VehiculoTurismo extends Vehiculo{
	private String matricula;


	public VehiculoTurismo(String marca, String año, String matricula) {
		super(marca, año);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String mostrarDatos() {
		return "La marca es: "+ getMarca() +" y el a�o es: "+ getAño()+" y la matricula es: "+matricula;
	}
}
