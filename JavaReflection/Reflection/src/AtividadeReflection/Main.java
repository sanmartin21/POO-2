package AtividadeReflection;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
			throws Exception {

		Scanner scan = new Scanner(System.in);
		String nameClass;
		
		System.out.printf("Informe o nome da classe:\n");
		nameClass = scan.next();
		
		nameClass = nameClass.replaceAll("\\/","");
		
		nameClass = nameClass.substring(0,1).toUpperCase() + nameClass.substring(1) + "Controller";
		NewInstance instance = new NewInstance();
				
		System.out.println(instance.newInstance(nameClass));	
		
		scan.close();
	}

}
