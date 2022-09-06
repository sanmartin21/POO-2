package atendimentoMedico;

import java.util.Scanner;

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
	
	public Atendimento() {
		
	}
	public Atendimento(Paciente paciente,Medico medico, AtendimentoInterface interfaceAtendimento) {
	        this.medico = medico;
	        this.paciente = paciente;
	        this.calculaPrioridade(interfaceAtendimento);
	        this.calculaEstado(interfaceAtendimento);
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

	public void calculaPrioridade(AtendimentoInterface atendimentoInterface) {
		System.out.println(atendimentoInterface.calculaEstado());
        Scanner input = new Scanner(System.in);
        this.estado = input.nextInt();
    }
	
	 public void calculaEstado(AtendimentoInterface atendimentoInterface) {
        System.out.println(atendimentoInterface.calculaEstado());
        Scanner input = new Scanner(System.in);
        this.estado = input.nextInt();
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
