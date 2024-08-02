package facade;

public class Test {

	public static void main(String[] args) {
		
		Produto product = new Produto(25, "Livro - Suicidas, Raphael Montes", 10);
		
		System.out.println("ID do Produto: " + product.productId);
		System.out.println("Nome do Produto: " + product.name);
		System.out.println("Quantidade Disponível: " + product.quantidade);
	
		LogisticsFacade.registrarPedido(product, 2);
	}

}
