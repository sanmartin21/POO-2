package injecaoDependenciaPersistenciaGenerics;

public class JsonGenerics <T> implements TipoPersistenciaGenerics{

	@Override
	public String persistir(AlunoGenerics object) {
		 String json = new com.google.gson.Gson().toJson(object);
	     return json;
	}

	
}
