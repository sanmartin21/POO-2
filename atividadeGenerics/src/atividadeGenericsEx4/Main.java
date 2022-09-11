package atividadeGenericsEx4;

public class Main {

	public static void main(String[] args) {


		VerificaChaveValor<String> verificaChaveValor = new VerificaChaveValor<>();
		verificaChaveValor.add("1234", "231321");
		verificaChaveValor.add("3312", "123123");
		
		
		System.out.print(verificaChaveValor.get("1234"));
		System.out.println("\n");
		System.out.print(verificaChaveValor.get("3312"));
	}

}
