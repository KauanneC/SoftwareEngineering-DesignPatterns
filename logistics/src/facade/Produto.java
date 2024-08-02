package facade;

public class Produto {
	
	public int productId;
	public String name;
	public int quantidade;
	
	public Produto(){
	
	}
	
	public Produto(int idProduto, String name, int quant){
		this.productId = idProduto;
		this.name = name;
		this.quantidade = quant;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantidade(int quant) {
		return quantidade;
	}
	
	public void setQuantidade(int quant) {
		this.quantidade = quant;
	}

}
