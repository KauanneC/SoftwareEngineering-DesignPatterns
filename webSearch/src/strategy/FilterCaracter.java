package strategy;

public class FilterCaracter implements Filter{
	
	
	public FilterCaracter() {
	}

	@Override
	public boolean interested(String frase) {
		return frase.length()>60?true:false;
	}

	@Override
	public void print(String frase) {
		System.out.println("So long..." + frase);
	}

}
