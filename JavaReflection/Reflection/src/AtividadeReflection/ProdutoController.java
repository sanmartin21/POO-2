package AtividadeReflection;

public class ProdutoController {
	
	private String nome;
	private double preco;
	private String descricao;


	public ProdutoController() {
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoController [nome=");
		builder.append(nome);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
	
}
