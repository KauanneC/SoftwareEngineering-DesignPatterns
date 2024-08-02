package facade;

public class ServicoEstoque {
	
	public static boolean isAvailable(Produto product, int quantPedida){
		if (product.quantidade>=quantPedida) {	
			product.setQuantidade(product.quantidade - quantPedida);
			return true;
		} else {
			return false;
		}
	}
}