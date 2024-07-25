package builder;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();

        CarBuilder builder1 = new CarBuilder();
        director.buildBmw(builder1);
        System.out.println(builder1.build());

        CarBuilder builder2 = new CarBuilder();
        director.buildToyota(builder2);
        System.out.println(builder2.build());
	}

}
