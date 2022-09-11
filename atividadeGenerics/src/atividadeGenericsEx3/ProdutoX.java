package atividadeGenericsEx3;

import java.util.Date;

public class ProdutoX {

	private int idPedido;
	private String nomeProduto;
	private double valor;
	private Date dataPedido;
	private Date dataEntrega;
	
	
	public ProdutoX(int idPedido, String nomeProduto,double valor, Date dataPedido, Date dataEntrega) {
		setIdPedido(idPedido);
		setNomeProduto(nomeProduto);
		setValor(valor);
		setDataPedido(dataPedido);
		setDataEntrega(dataPedido);
	}


	public int getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Date getDataPedido() {
		return dataPedido;
	}


	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}


	public Date getDataEntrega() {
		return dataEntrega;
	}


	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoX [idPedido=");
		builder.append(idPedido);
		builder.append(", nomeProduto=");
		builder.append(nomeProduto);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataPedido=");
		builder.append(dataPedido);
		builder.append(", dataEntrega=");
		builder.append(dataEntrega);
		builder.append("]");
		return builder.toString();
	}
}
