package PracticasEclipseAlgoritmos.trainning;

public class Rooms {

	private String brand;
	private int ram;
	private int price;
	
	public Rooms(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Rooms [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
