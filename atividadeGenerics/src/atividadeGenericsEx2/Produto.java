package atividadeGenericsEx2;

import java.util.Date;

public class Produto <T>{

	private T idProduto;
	private double valor;
	private Date dataFabricacao;
	private Date dataValidade;
	
	
	public Produto(T idProduto, double valor, Date dataFabricacao, Date dataValidade) {
		setIdProduto(idProduto);
		setValor(valor);
		setDataFabricacao(dataFabricacao);
		setDataValidade(dataValidade);
	}


	public T getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(T idProduto) {
		this.idProduto = idProduto;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Date getDataFabricacao() {
		return dataFabricacao;
	}


	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}


	public Date getDataValidade() {
		return dataValidade;
	}


	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	 public T get() {
	        return idProduto;
	 }


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [idProduto=");
		builder.append(idProduto);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataFabricacao=");
		builder.append(dataFabricacao);
		builder.append(", dataValidade=");
		builder.append(dataValidade);
		builder.append("]");
		return builder.toString();
	}
	
}
