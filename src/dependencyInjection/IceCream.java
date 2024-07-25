package dependencyInjection;

public class IceCream implements Food{

	@Override
	public void prepare() {
		System.out.println("One ice cream is ready!!!");
	}

}
