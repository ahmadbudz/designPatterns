package dependencyInjection;

public class Burger implements Food{

	@Override
	public void prepare() {
		System.out.println("One burger is ready!!!!");
	}

}
