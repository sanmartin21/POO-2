package sistemaAcademico;

public class FabricaAlunoEletronica implements FabricaDeAluno{

	@Override
	public Aluno criarAluno() {
		return new AlunoEletronica();
	}
}
