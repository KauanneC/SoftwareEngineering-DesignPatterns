package factory;

public class Criminal implements Enemy{

	@Override
	public void attack() {
		System.out.println("Criminoso te deu um tiro!");
	}
}
