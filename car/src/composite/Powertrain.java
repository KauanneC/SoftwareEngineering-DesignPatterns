package composite;

import java.util.ArrayList;
import java.util.List;

public class Powertrain implements CarParts {
	
private List<CarParts> piece = new ArrayList<>();
	
	public Powertrain() {
		piece.add(new Pieces("Motor", 150.00));
		piece.add(new Pieces("Transmissão", 50.00));
		piece.add(new Pieces("Diferencial", 40.00));
		piece.add(new Pieces("Rodas", 80.00));
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
