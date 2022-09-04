package modeloTradicional;

public class AlertaImplements {

	protected NotificacaoImplements notificacaoImplements;
	
	public AlertaImplements(NotificacaoImplements notificacaoImplements) {
		this.notificacaoImplements = notificacaoImplements;
	}
	
	
	
	public String dispararAlerta() {
		return this.notificacaoImplements.enviar();
	}
	
}
