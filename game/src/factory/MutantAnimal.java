package factory;

public class MutantAnimal implements Enemy{
	
	@Override
	public void attack() {
		System.out.println("O animal mutante arrancou sua perna!");
	}

}
