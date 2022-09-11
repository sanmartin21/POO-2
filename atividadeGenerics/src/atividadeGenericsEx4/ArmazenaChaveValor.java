package atividadeGenericsEx4;

public class ArmazenaChaveValor <T>{

	public String chave;
	public T valor;
	
	
	public ArmazenaChaveValor(String chave, T valor){
		setValor(valor);
		setChave(chave);
	}
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("armazenaChaveValor [chave=");
		builder.append(chave);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
