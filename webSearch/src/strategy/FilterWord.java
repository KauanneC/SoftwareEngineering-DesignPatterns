package strategy;

public class FilterWord implements Filter{
	
	public FilterWord() {
	}

	@Override
	public boolean interested(String frase) {
		return frase.toLowerCase().contains("friend")?true:false;
	}

	@Override
	public void print(String frase) {
		System.out.println("Oh Yes!" + frase);
	}
	
}
