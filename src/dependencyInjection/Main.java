package dependencyInjection;

public class Main {

	public static void main(String[] args) {
		Chef burgerChef = new Chef(new Burger());
		burgerChef.prepare();
		
		Chef iceCreamChef = new Chef(new IceCream());
		iceCreamChef.prepare();
	}

}
