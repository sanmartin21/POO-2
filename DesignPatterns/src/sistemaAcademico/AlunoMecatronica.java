package sistemaAcademico;

public class AlunoMecatronica implements Aluno{
	
	
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
		return "Aluno = Mecatronica";
	}

}
