package singleton;

public class DBSingleton {

	private static DBSingleton instance;
	private String key;

	private DBSingleton(String key) {
		this.key = key;
	}

	public static DBSingleton getInstanceDB(String key) {
		if (instance == null) {
			instance = new DBSingleton(key);
		}
		return instance;
	}

	public String[] getUserNames() {
		return new String[] { "ahmad", "hamed", "ali", "john" };
	}

}
