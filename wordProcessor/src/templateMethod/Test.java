package templateMethod;

public class Test {

	public static void main(String[] args) {
		
		TudoMaiuscula maiuscula = new TudoMaiuscula();
		TudoMinuscula minuscula = new TudoMinuscula();
		
		String texto = "Nothing. Just a incident on the race";
		
		String maisculo = maiuscula.converterTexto(texto);
		String minusculo = minuscula.converterTexto(texto);
		
		System.out.println(maisculo);
		System.out.println(minusculo);
	}

}
