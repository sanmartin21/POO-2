import java.util.ArrayList;
import java.util.List;

public class LBanana2 {

	public static void main(String[] args) {

		//JEITO ERRADO DE SER FEITO -- TERÁ WARNINGSS
		
		List list = new ArrayList();
		Banana b = new Banana("Branca", "Brasil");
		list.add(b);
		Banana b1 = (Banana)list.get(0);
		System.out.println(b1.toString());


	}

}
