package sistemaAcademico;

public class AlunoEletronica implements Aluno{
	
	private int numeroAlunos;
	private int turma;
	
	
	
	public int getNumeroAlunos() {
		return numeroAlunos;
	}
	public void setNumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}
	public int getTurma() {
		return turma;
	}
	public void setTurma(int turma) {
		this.turma = turma;
	}
	
	
	@Override
	public String exibirInfo() {
		return "Aluno = Eletronica";
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Eletronica [numeroAlunos=");
		builder.append(numeroAlunos);
		builder.append(", turma=");
		builder.append(turma);
		builder.append("]");
		return builder.toString();
	}

}
