package factory;

import java.util.List;

public class RioJaneiro extends Location {
	
	public RioJaneiro() {
		System.out.println(getDescription());
	}

	@Override
	public String getDescription() {
		return "\nVocê está no Rio de Janeiro!";
	}

	@Override
	public List<Enemy> generateEnemies() {
		for (int i = 0; i <= 5; i++) {
			listEnemy.add(enemy.createEnemy("Criminal"));
		}
		
		System.out.println("Estamos perto da favela, existem 5 criminosos por perto");
		listEnemy.get(0).attack();
		return listEnemy;
	}
}
