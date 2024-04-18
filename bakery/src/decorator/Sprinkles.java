package decorator;

public class Sprinkles extends CakeDecorator {
	
	public Sprinkles(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public int getCost() {
		return cake.getCost() + 2;
	}

	@Override
	public String getDescription() {
		return cake.getDescription() + " with sprinkles";
	}

}
