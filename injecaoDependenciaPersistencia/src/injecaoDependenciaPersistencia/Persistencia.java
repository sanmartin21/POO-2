package injecaoDependenciaPersistencia;

public class Persistencia {

	protected TipoPersistencia persistencia;
	
	
	
	public Persistencia(TipoPersistencia persistencia) {
		this.persistencia = persistencia;
	}



	public String persistir(Aluno aluno) {
		return this.persistencia.persistir(aluno);
	}
}
