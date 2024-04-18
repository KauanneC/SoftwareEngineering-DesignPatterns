package factory;

public class EnemyFactory {

	public Enemy createEnemy(String type) {
		
		// Comparando o valor de type
		if (type.equals("AnimalMutante")) {
			return new MutantAnimal();
			
		} else if (type.equals("Cangaceiro")) {
			return new Cangaceiro();
		
		} else if (type.equals("Criminal")){
			return new Criminal();
		
		} else {
			return null;
		}
	}
}