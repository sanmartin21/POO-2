package modeloTradicional;

public class Alerta {
	
	//classe que envia a notificacao

	protected Notificacao notificacao;
	
	public Alerta(Notificacao notificacao) {
		this.notificacao = notificacao;
	}
	
	
	
	public String dispararAlerta() {
		return this.notificacao.enviar();
	}
	

	
}
