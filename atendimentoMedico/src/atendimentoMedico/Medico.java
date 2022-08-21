package atendimentoMedico;

import java.util.Date;

public class Medico extends Pessoa{
	
	protected Especialidade especialidade;
	
	public Medico(String nome, Date dataNascimento) {
		super(nome, dataNascimento);
		
		especialidade = new Especialidade();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [especialidade=");
		builder.append(especialidade);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
