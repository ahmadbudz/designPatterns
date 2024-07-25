package factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("What type of meat you want on your shawarma? (beef / chicken )");
		ShawarmaFactory factory = new ShawarmaFactory();
		if (userInput.hasNextLine()) {
			Meats meat = Meats.valueOf(userInput.nextLine().toUpperCase());
			Shawarma shawarma = factory.makeShawarma(meat);
			shawarma.preparer();
		}
		userInput.close();
	}

}
