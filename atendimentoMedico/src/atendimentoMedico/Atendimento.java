package atendimentoMedico;

public class Atendimento {
	
	private int prioridade;
	private int estado;
	protected Paciente paciente;
	protected Medico medico;
	

	public Atendimento(int prioridade, int estado) {
		setPrioridade(prioridade);
		setEstado(estado);
		
		paciente = new Paciente(null, null);
		medico = new Medico(null, null);
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
	
	
	
}