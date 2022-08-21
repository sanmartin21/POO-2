package zooPOO2;

public class main {

	public static void main(String[] args) {


		//coracao 
		
		Coracao c = new Coracao();
		c.setTipoSanguineo("B");
		System.out.println(c);
		
		//habilidades
		
		Habilidades h = new Habilidades();
		h.setDescricao("Morder");
		System.out.println(h);
		
		//animal
		
		Animal a = new Animal("Amarelo", 100);
		a.coracao.setTipoSanguineo("A");
		a.habilidades.setDescricao("Correr");
		System.out.println(a);
		
		//mamífero
		
		Mamifero m = new Mamifero("Amarelo", 100, 110, "Leao", 3, false);
		m.coracao.setTipoSanguineo("B");
		m.habilidades.setDescricao("Caçar");
		System.out.println(m);
		System.out.println(m.isVeloz());
		System.out.println(m.isVenenoso());
		System.out.println(m.respiracao("Oxigênio"));
		
		
		//ar
		
		Ar ar = new Ar();
		ar.setDescricao("Nitrogenio");
		System.out.println(ar);
	}

}
