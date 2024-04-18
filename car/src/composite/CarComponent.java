package composite;

import java.util.ArrayList;
import java.util.List;

public class CarComponent implements CarParts {
	
	public static double weight = 0;
	private List<CarParts> piece = new ArrayList<>();

	public CarComponent()
	{
		piece.add(new Chassi());
		piece.add(new Body());
	}
	
	public static void totalParcial(double tp) {
		weight += tp;
	}

	@Override
	public double calculateWeight() {
		double totalWeight = 0;
		
		for (CarParts piece : piece) {
			totalWeight += piece.calculateWeight();
		}
		
		System.out.println("\nPeso final do carro: " + String.format("%.2f", totalWeight));
		return totalWeight;
	}

}
