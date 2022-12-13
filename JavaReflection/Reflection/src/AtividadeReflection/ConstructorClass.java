package AtividadeReflection;

public class ConstructorClass {
	
	public Class<?> constructorClass(String nameClass) throws Exception{
		try {
			Class<?> classT = Class.forName("AtividadeReflection." + nameClass);	
			return classT;
		}
		catch(Exception ex){
			throw new Exception("Classe "+ nameClass + " não encontrada.");
		}
	}
}
