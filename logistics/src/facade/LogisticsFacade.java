package facade;

public class LogisticsFacade {
	
	public static void registrarPedido(Produto produto, int quantPedida) {
		
		if (ServicoEstoque.isAvailable(produto, quantPedida)) {
			
			System.out.println("\nA quantidade que você pediu foi: " + quantPedida + ". Esta quantidade está disponível no estoque :)");
			ServicoPagamento.makePayment();
			ServicoRemessa.shipProduct(produto);
		
		} else {
			System.out.println("\n" + produto.name + " não está disponível no estoque :(");
		}
	}
}
