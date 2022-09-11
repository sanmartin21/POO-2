
public class MainCompareTo {

	public static void main(String[] args) {

		Integer[] meuArray = {1,2,3,4,5,6,7,8,9,10};
		Integer valor = 3;
		
		int cont = Comp.<Integer>countGreaterThan(meuArray, valor);
		System.out.println(cont);

	}

}
