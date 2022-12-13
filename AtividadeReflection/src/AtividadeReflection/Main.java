package AtividadeReflection;

import java.lang.reflect.Constructor;
import java.util.Scanner;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) 
			throws ClassNotFoundException, 
			NoSuchMethodException, SecurityException, 
			InstantiationException, IllegalAccessException, 
			IllegalArgumentException, InvocationTargetException {
		
		Scanner ler = new Scanner(System.in);
		String string;
		
		System.out.printf("Informe o nome da classe:\n");
		string = ler.next();
		
		string = string.replace( "/" , "");
		
		if (string != null) {
			if(string.equals("produto")) {
				string = "ProdutoController";
			}
		}
		else {
			System.out.println("O produto informado é nulo.");
		}
		
		try {
			Class<?> classT = 
					Class.forName("AtividadeReflection." + string);
			Constructor<?> constT = 
					classT.getDeclaredConstructor();
			
			System.out.println(constT);
			
			Object obj = constT.newInstance();
			
			System.out.println(obj);
		}
		catch(Exception ex){
			System.out.println("Classe não encontrada.");
			string = ler.next();
		}
	}
}
