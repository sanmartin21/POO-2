package atividadeGenericsEx4;
/**
 * Classe base que recebe um parâmetro genérico
 * @author jvsanmarin@yahoo.com.br
 *
 * @param <T> Parâmetro principal da classe
 */
public class ArmazenaChaveValor <T>{

	public String chave;
	public T valor;
	
	/**
	 * Detalhamento do construtor
	 * @param chave Chave da classe, utilizada como uma chave primária, valor String
	 * @param valor Valor é um tipo genérico que será passado na criação do objeto
	 */
	
	
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
