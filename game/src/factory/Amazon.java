package factory;

import java.util.List;

public class Amazon extends Location {
	
	public Amazon() {
		System.out.println(getDescription());
	}
	
	@Override
	public String getDescription() {
        return "Você está na Amazônia!!";
    }

	@Override
	public List<Enemy> generateEnemies() {
		// Preenchendo a lista de inimigos
		for (int i = 0; i <= 5; i++) {
			listEnemy.add(enemy.createEnemy("AnimalMutante"));
		}
		
		System.out.println("Aqui existem 5 animais mutantes, cuidado!");
		listEnemy.get(0).attack();
		
		return listEnemy;
	}
}