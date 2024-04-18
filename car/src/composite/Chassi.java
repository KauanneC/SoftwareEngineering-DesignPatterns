package composite;

import java.util.ArrayList;
import java.util.List;

public class Chassi implements CarParts {
	
	private List<CarParts> piece = new ArrayList<>();
	
	public Chassi() {
		piece.add(new Pieces("Suspensão", 400.30));
		piece.add(new Powertrain());
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
