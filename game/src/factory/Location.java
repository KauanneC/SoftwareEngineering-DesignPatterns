package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Location {

	public EnemyFactory enemy = new EnemyFactory();  // Fábrica de inimigos
	
	public abstract String getDescription();
	public abstract List<Enemy> generateEnemies();
	
	public List<Enemy> listEnemy = new ArrayList<Enemy>();
}
