package factory;

public class ShawarmaFactory {

	public Shawarma makeShawarma(Meats meat) {
		switch (meat) {
		case BEEF:
			return new BeefShawarma();
		case CHICKEN:
			return new ChickenShawarma();
		default:
			return null;
		}

	}
}
