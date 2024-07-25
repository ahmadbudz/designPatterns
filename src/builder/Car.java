package builder;

public class Car {

	private final int id;
	private final int height;
	private final String brand;
	private final String model;
	private final String color;
	private final String engine;

	Car(int id, String brand, String model, String color, int height, String engine) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.height = height;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car model is " + model + " car brand is " + brand + "\ncar color is " + color + " car engine is "
				+ engine;
	}

}
