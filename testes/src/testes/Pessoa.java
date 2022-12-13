package testes;

public class Pessoa {
	
	private String nome;
	private String sobrenome;

	public Pessoa(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String nomeCompleto() {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append(" ");
		builder.append(sobrenome);
		return builder.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append("]");
		return builder.toString();
	}


	
}
