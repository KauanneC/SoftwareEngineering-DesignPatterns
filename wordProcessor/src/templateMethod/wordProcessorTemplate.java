package templateMethod;

public abstract class wordProcessorTemplate {
	
	final String converterTexto(String entrada) {
		
		char[] caracteres = extrairCaracteres(entrada);
		char[] caracateresConvertidos = converterCaracteres(caracteres);
		String resultado = juntarCaracteres(caracateresConvertidos);
		
		return resultado;
	}
	
	char[] extrairCaracteres(String texto) {
		return texto.toCharArray();
	}
		
	String juntarCaracteres(char[] chars) {
		
		String texto="";
		
		for (int i=0; i<chars.length; i++) {
			
			texto += String.valueOf(chars[i]);
		}
		
		return texto;
	}
	
	abstract char[] converterCaracteres(char[] chars);

}
