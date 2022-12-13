package AtividadeReflection;

import java.lang.reflect.Constructor;

public class NewInstance {

	public Object newInstance(String nameClass) throws Exception{
		
		ConstructorClass constructor = new ConstructorClass();
		Class<?> classT = constructor.constructorClass(nameClass);
		
		Object object;
		
		try {
			Constructor<?> constT = classT.getDeclaredConstructor();
			
			object = constT.newInstance();
			
			return object;
		}
		catch (Exception ex) {
			throw new Exception("Houve um erro ao realizar a Instância da Classe.");
		}
	}
}
