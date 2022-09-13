package injecaoDependenciaPersistenciaGenerics;


public class PersistenciaGenerics{
	
protected TipoPersistenciaGenerics persistencia;
	
	
	
	public PersistenciaGenerics(TipoPersistenciaGenerics persistencia) {
		this.persistencia = persistencia;
	}



	public String persistir(AlunoGenerics aluno) {
		return this.persistencia.persistir(aluno);
	}

}
