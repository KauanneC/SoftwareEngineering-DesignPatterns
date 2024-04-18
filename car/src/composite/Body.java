package composite;

import java.util.ArrayList;
import java.util.List;

public class Body implements CarParts {
	
	private List<CarParts> piece = new ArrayList<>();
	
	public Body() {
		piece.add(new Pieces("Para-lamas", 15.20));
		piece.add(new Pieces("Portas", 120.00));
		piece.add(new Pieces("Painés", 10.35));
		piece.add(new Pieces("Porta-malas", 25.00));
		piece.add(new Pieces("Capô", 20.50));
	}
	
	@Override
	public double calculateWeight() {
		double totalWeight = 0;
		
		for (CarParts piece : piece) {
			totalWeight += piece.calculateWeight();
		}
		
		return totalWeight;
	}
}
