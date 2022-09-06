package atendimentoMedico;

public class AtendimentoGenerico {

	protected AtendimentoInterface atendimentoInterface;

	public AtendimentoGenerico(AtendimentoInterface atendimentoInterface) {
		this.atendimentoInterface = atendimentoInterface;
	}
	
	
	public String calcularEstado() {
		return this.atendimentoInterface.calculaEstado();
	}
	
	public String calcularPrioridade() {
		return this.atendimentoInterface.calculaPrioridade();
	}
	
}
