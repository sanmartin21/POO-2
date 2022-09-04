package injecaoDependenciaPersistencia;


public class Json implements TipoPersistencia{

	@Override
	public String persistir(Aluno object) {
		 String json = new com.google.gson.Gson().toJson(object);
	     return json;
	}

	
	
}
