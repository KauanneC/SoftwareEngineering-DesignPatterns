package composite;

public class Pieces implements CarParts {
	
	private String name;
	private double weight;
	
	public Pieces() {
	}
	
	public Pieces(String name, double weight) {
		this.name = name;
		this.weight = weight;
		CarComponent.totalParcial(this.weight);
		System.out.println("Somando agora o peso de " + getName() + ": " + String.format("%.2f", getWeight()) + ". Total parcial: " + CarComponent.weight);
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public double calculateWeight() {
		return getWeight();
	}
	
}
