package factory;

public class Main {
	
	public static void main(String[] args) {
		Location location;
		
		location = new Amazon();
		location.listEnemy = location.generateEnemies();
		
		location = new BrazilianHinterland();
		location.listEnemy = location.generateEnemies();
		
		location = new RioJaneiro();
		location.listEnemy = location.generateEnemies();
	}

}