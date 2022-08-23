package atendimentoMedico;

public class Atestado extends Operacao{
	
	private int cid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
	public void emitirAtestado(Atendimento atendimento) {
		
		System.out.println("-----Atestado-----");
		System.out.println("Inicio do Atendimento = " + atendimento.getInicio());
		System.out.println("Fim do Atendimento = " + atendimento.getFim());
		System.out.println("Paciente = " + atendimento.paciente.getNome());
		System.out.println("Médico = " + atendimento.medico.getNome());
		System.out.println("Prioridade: " + atendimento.getPrioridade());
		System.out.println("Possíveis estados: ");
		System.out.println("1 = Cadastro e ganho da fita.");
		System.out.println("2 = Triagem.");
		System.out.println("3 = Atendimento Médico");
		System.out.println("Estado Atual: " + atendimento.getEstado());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [cid=");
		builder.append(cid);
		builder.append(", getInicio()=");
		builder.append(getInicio());
		builder.append(", getFim()=");
		builder.append(getFim());
		builder.append("]");
		return builder.toString();
	}
	
	

}
