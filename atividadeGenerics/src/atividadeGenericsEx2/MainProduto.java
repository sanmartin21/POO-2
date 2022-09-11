package atividadeGenericsEx2;

public class MainProduto {

	public static void main(String[] args) {


		 Produto<Integer> integer = new Produto<Integer>(1, 300.59, null, null);
		 Produto<String> string = new Produto<String>("Um", 300.59, null, null);
		 
		 System.out.println(new Produto<Integer>(1, 300.59, null, null)+"\n");
		 System.out.println(new Produto<String>("Um", 300.59, null, null)+"\n");

         System.out.printf("Integer Value :%d\n\n", integer.get());
         System.out.printf("String Value :%s\n", string.get());
	}

}
