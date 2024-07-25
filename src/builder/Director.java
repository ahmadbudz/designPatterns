package builder;

public class Director {

	public void buildBmw(Builder builder) {
		builder.brand("BMW").model("e34").color("White").engine("8L").height(150);
	}

	public void buildToyota(Builder builder) {
		builder.brand("Toyota").model("Corolla").color("Black").engine("2L").height(150);
	}

}
