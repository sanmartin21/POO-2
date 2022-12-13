package atividadeGenericsEx3;

import java.util.Date;

public class Televisao extends ProdutoX{

	private String descricao;

	public Televisao(int idPedido, String nomeProduto, double valor, Date dataPedido, Date dataEntrega, String descricao) {
		super(idPedido, nomeProduto, valor, dataPedido, dataEntrega);
		setDescricao(descricao);
	}

	
	
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
