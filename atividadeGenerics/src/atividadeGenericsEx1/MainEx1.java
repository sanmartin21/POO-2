package atividadeGenericsEx1;


public class MainEx1 {

	public static void main(String[] args) {

		 Aluno a = new Aluno("João Vitor Lehmen Sanmartin", 2131);
				
		 LAluno<Integer> integer = new LAluno<Integer>();
		 LAluno<String> string = new LAluno<String>();
		 LAluno<Aluno> aluno = new LAluno<Aluno>();

         integer.add(Integer.valueOf(10));
         string.add(new String("Hello World"));
         aluno.add(a);

         System.out.printf("Integer Value :%d\n\n", integer.get());
         System.out.printf("String Value :%s\n", string.get());
         System.out.printf("Object Value :%s\n", aluno.get());
         

	}

}
