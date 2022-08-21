package atendimentoMedico;

import java.util.Date;

public class Paciente extends Pessoa{
	
	public Paciente(String nome, Date dataNascimento) {
		super(nome, dataNascimento);
		
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente []");
		return builder.toString();
	}

	
}
