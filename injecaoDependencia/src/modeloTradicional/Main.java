package modeloTradicional;

public class Main {

	public static void main(String[] args) {


		NotificacaoWspp w = new NotificacaoWspp();
		Alerta a = new Alerta(w);
		System.out.println(a.dispararAlerta());
		
		
		
		NotificacaoEmail e = new NotificacaoEmail();
		Alerta b = new Alerta(e);
		System.out.println(b.dispararAlerta());
		
		
		NotificacaoSMS s = new NotificacaoSMS();		
		Alerta c = new Alerta(s);
		System.out.println(c.dispararAlerta());
	}

}
