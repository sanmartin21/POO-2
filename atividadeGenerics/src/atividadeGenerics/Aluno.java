package atividadeGenerics;

public class Aluno {
	
	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		setNome(nome);
		setMatricula(matricula);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [nome=");
		builder.append(nome);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
