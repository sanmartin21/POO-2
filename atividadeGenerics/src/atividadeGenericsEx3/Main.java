package atividadeGenericsEx3;

public class Main {

	public static void main(String[] args) {

		
		Pedido<ProdutoX> pedido = new Pedido<ProdutoX>();
		
		pedido.add(new ProdutoX(2131, "Televisão", 3.500, null, null));
		pedido.add(new ProdutoX(2506, "Carro Zero", 33.500, null, null));
	
		System.out.println(pedido.mostrarListaProdutos());
	}

}
