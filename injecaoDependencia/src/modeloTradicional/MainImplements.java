package modeloTradicional;

public class MainImplements {

	public static void main(String[] args) {



		NotificacaoWsppImplements w = new NotificacaoWsppImplements();
		AlertaImplements a = new AlertaImplements(w);
		System.out.println(a.dispararAlerta());
		
		
		
		NotificacaoEmailImplents e = new NotificacaoEmailImplents();
		AlertaImplements b = new AlertaImplements(e);
		System.out.println(b.dispararAlerta());
		
		
		NotificacaoSMSImplements s = new NotificacaoSMSImplements();		
		AlertaImplements c = new AlertaImplements(s);
		System.out.println(c.dispararAlerta());

	}

}
