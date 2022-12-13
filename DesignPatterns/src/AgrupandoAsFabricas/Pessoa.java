package AgrupandoAsFabricas;

public class Pessoa implements IPessoa{

	private String nome;
	private String sexo;
	
	public Pessoa(String nome, String sexo) {
		setNome(nome);
		setSexo(sexo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append("]");
		return builder.toString();
	}
}
