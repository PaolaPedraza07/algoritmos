package PracticasEclipseAlgoritmos.Polimorfismo;

public class Main {

	public static void main(String[] args) {
	
		Vehiculo[] vehiculos = new Vehiculo[4];
		vehiculos[0] = new Vehiculo("Mazda", "2022");
		vehiculos[1] = new VehiculoSport("Audi", "2015", "4");
		vehiculos[2] = new VehiculoTurismo("Honda", "2017", "JNB-12-16");
		
		for(Vehiculo vehic : vehiculos) {
			System.out.println(vehic.mostrarDatos());
		}
 
	}

}
