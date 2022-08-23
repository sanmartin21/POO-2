package atendimentoMedico;

import java.util.Iterator;

public class Atendimento extends Operacao {

	private int prioridade;
	private int estado;
	protected Paciente paciente;
	protected Medico medico;

	public Atendimento(int prioridade, int estado, Paciente paciente) {
		setPrioridade(prioridade);
		setEstado(estado);
		this.paciente = paciente;

	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void calculaPrioridade(boolean respostas[]) {
		int prioridade = 0;
		for (int i = 0; i < respostas.length; i++) {
			if (respostas[i] = true) {
				prioridade = i;
			}

		}
		
		if (prioridade == 0) {
			System.out.println(prioridade + "- Cor azul (N�o Urgente)");
		}
		
		else if (prioridade == 1) {
			System.out.println(prioridade + "- Cor verde (Pouco Urgente)");
		}
		
		else if (prioridade == 2) {
			System.out.println(prioridade + "- Cor Amarela (Urgente)");
		}
		
		else if (prioridade == 3) {
			System.out.println(prioridade + "- Cor Laranja (Muito Urgente)");
		}
		
		else if (prioridade == 4) {
			System.out.println(prioridade + "- Cor Vermelha (Emerg�ncia)");
		}
		else if (prioridade == 6) {
			System.out.println(prioridade + "- prioridade n�o cadastrada.");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [prioridade=");
		builder.append(prioridade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append(", medico=");
		builder.append(medico);
		builder.append("]");
		return builder.toString();
	}

	
}
