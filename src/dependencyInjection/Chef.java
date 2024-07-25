package dependencyInjection;

public class Chef {
	
	private Food food;
	
	//constructer injection
	public Chef(Food food) {
		this.food = food;
	}
	
	public void prepare() {
		food.prepare();
	}
	
}
