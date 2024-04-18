package factory;

import java.util.List;

public class BrazilianHinterland extends Location {
	
	public BrazilianHinterland() {
		System.out.println(getDescription());
	}
	
	@Override
	public String getDescription() {
		return "\nVocê entro no sertão brasileiro!";
	}
	
	@Override
	public List<Enemy> generateEnemies() {
		for (int i = 0; i <= 5; i++) {
			listEnemy.add(enemy.createEnemy("Cangaceiro"));
		}
		
		System.out.println("Lampião e os cangaceiros vão te pegar!");
		listEnemy.get(0).attack();
		return listEnemy;
	}

}
