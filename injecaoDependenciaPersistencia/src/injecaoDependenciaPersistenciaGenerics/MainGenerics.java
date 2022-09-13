package injecaoDependenciaPersistenciaGenerics;
import injecaoDependenciaPersistencia.Json;
import injecaoDependenciaPersistencia.Xml;

public class MainGenerics {

	public static void main(String[] args) {
		
		XmlGenerics<Xml>  xmlGenerics = new XmlGenerics<>();
		JsonGenerics<Json> jsonGenerics = new JsonGenerics<>();
		
		AlunoGenerics joaoVitor = new AlunoGenerics("João Vitor", 1, "097.455.659-98", "21/02/2003", "jvsanmartin@yahoo.com.br");
		AlunoGenerics alexandra = new AlunoGenerics("Alexandra", 123, "097.455.888-56", "11/12/2010", "alexsan@yahoo.com.br");
		

		PersistenciaGenerics persistencia = new PersistenciaGenerics(xmlGenerics);
		PersistenciaGenerics persistencia2 = new PersistenciaGenerics(jsonGenerics);
		
		System.out.println("Usando XML: \n"+persistencia.persistir(joaoVitor));
		System.out.println("Usando json: \n"+persistencia2.persistir(alexandra));
	}
}
