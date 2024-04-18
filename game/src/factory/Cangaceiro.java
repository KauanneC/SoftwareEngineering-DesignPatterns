package factory;

public class Cangaceiro implements Enemy{
	
	@Override
	public void attack() {
		System.out.println("Lampião e os cangaceiros te cercaram, você é uma pessoa morta!");
	}
}
