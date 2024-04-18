package decorator;

public class MultiLayred extends CakeDecorator{
	
	public MultiLayred(Cake cake) {
		this.cake = cake;
	}

	@Override
	public int getCost() {
		return cake.getCost() + 5;
	}
	
	@Override
	public String getDescription() {
		return "Multi-layered " + cake.getDescription();
	}
	
}