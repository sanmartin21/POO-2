package injecaoDependenciaPersistencia;

public class Main {

	public static void main(String[] args) {


		Aluno joaoVitor = new Aluno("João Vitor", 1, "097.455.659-98", "21/02/2003", "jvsanmartin@yahoo.com.br");
		Aluno alexandra = new Aluno("Alexandra", 123, "097.455.888-56", "11/12/2010", "alexsan@yahoo.com.br");
		

		Xml xml = new Xml();
		Json json = new Json();
		
		joaoVitor.persistir(json);
		alexandra.persistir(xml);
	}

}
