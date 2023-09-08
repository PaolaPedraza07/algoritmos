package PracticasEclipseAlgoritmos.Polimorfismo;

public class VehiculoSport extends Vehiculo {
	private String cilindros;

	public VehiculoSport(String marca, String año, String cilindros) {
		super(marca, año);
		this.cilindros = cilindros;
	}

	public String getCilindros() {
		return cilindros;
	}

	public void setCilindros(String cilindros) {
		this.cilindros = cilindros;
	}
	
	@Override
	public String mostrarDatos() {
		return "La marca es: "+ getMarca() +" y el a�o es: "+ getAño()+" los cilindors son: "+cilindros;
	}

}
