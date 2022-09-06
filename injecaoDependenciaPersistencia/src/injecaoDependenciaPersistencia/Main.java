package injecaoDependenciaPersistencia;

public class Main {

	public static void main(String[] args) {


		Xml xml = new Xml();
		Json json = new Json();
		
		Aluno joaoVitor = new Aluno("João Vitor", 1, "097.455.659-98", "21/02/2003", "jvsanmartin@yahoo.com.br");
		Aluno alexandra = new Aluno("Alexandra", 123, "097.455.888-56", "11/12/2010", "alexsan@yahoo.com.br");
		

		Persistencia persistencia = new Persistencia(xml);
		Persistencia persistencia2 = new Persistencia(json);
		
		System.out.println("Usando XML: \n"+persistencia.persistir(joaoVitor));
		System.out.println("Usando json: \n"+persistencia2.persistir(alexandra));
	}

}
