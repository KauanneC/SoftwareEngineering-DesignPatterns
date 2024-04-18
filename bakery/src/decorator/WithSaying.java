package decorator;

public class WithSaying extends CakeDecorator {
	
	private String saying;
	
	public WithSaying(Cake cake, String saying) {
		this.cake = cake;
		this.saying = saying;
	}
	
	@Override
	public int getCost() {
		return cake.getCost() + 0;
	}

	@Override
	public String getDescription() {
		return cake.getDescription() + " with saying " + saying;
	}
}