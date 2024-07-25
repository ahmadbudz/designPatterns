package singleton;

public class Main {

	public static void main(String[] args) {

		DBSingleton singleton1 = DBSingleton.getInstanceDB("instance 1");
		System.out.println(singleton1);
		DBSingleton singleton2 = DBSingleton.getInstanceDB("instance 2");
		System.out.println(singleton2);

		System.out.println("is singleton 1 and singleton the same object?: " + (singleton1 == singleton2));

		for (String name : singleton2.getUserNames()) {
			System.out.println(name);
		}

	}

}
