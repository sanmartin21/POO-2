package atendimentoMedico;


public class Atendimento extends Operacao {

	private String prioridade;
	private String estado;
	protected Paciente paciente;
	protected Medico medico;

	public Atendimento(Paciente paciente, Medico medico) {
		this.paciente = paciente;
		this.medico = medico;

	}
	
	public Atendimento() {
		
	}
	 


	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String string) {
		this.prioridade = string;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
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

	public void calculaPrioridade(int prioridade) {
		if(prioridade == 1) {
			this.setPrioridade("Não Urgente|Not Urgent");
		}else if(prioridade == 2) {
			this.setPrioridade("Pouco Urgente|Little Urgent");
		}else if(prioridade == 3) {
			this.setPrioridade("Urgente|Urgent");
		}
		else if(prioridade == 4) {
			this.setPrioridade("Muito Urgente|Very Urgent");
		}
		else if(prioridade == 5) {
			this.setPrioridade("Emergência|Emergency");
		}
		else {
			this.setPrioridade(null);
		}
		
		
    }
	
	 public void calculaEstado(int estado) {

		 if(estado == 1) {
			 this.setEstado("Ferido|Injured");
		 }
		 else if(estado == 2) {
			 this.setEstado("Sangrando|Bleeding");
		 }
		 else if(estado == 3) {
			 this.setEstado("Com fraturas|With fractures");
		 }
		 else if(estado == 4) {
			 this.setEstado("Desmaiado|Passed out");
		 }
		 else if(estado == 5) {
			 this.setEstado("Decretado óbito|Death decree");
		 }
		 else {
			 this.setEstado(null);
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
