package atendimentoMedico;

import java.util.Date;

public class Medico extends Pessoa{
	
	protected Especialidade especialidade;
	
	public Medico(Especialidade especialidade, String nome, String dataNascimento) {
		setNome(nome);
		this.setDataNascimento(dataNascimento);
		especialidade = new Especialidade();
	}
	
	public Medico() {
		
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
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
