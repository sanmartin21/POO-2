package sistemaAcademico;

public class FabricaAlunoMecatronica implements FabricaDeAluno{
	
	@Override
	public Aluno criarAluno() {
		return new AlunoMecatronica();
	}

}
