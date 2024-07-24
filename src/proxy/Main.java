package proxy;

public class Main {

	public static void main(String[] args) {
		Image image = new ProxyImage("example.jpg");
		 
        image.display();
 
        image.display();
	}

}
