
public class MainUtil {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(1, "apple");
		boolean same = Util.<Integer, String>compare(p1,p2);
		System.out.println(same);
		
		
		
		Pair<Integer, String> p3 = new Pair<>(1, "apple");
		Pair<Integer, String> p4 = new Pair<>(1, "apple");
		boolean result = Util.<Integer, String>compare(p3,p4);
		System.out.println(result);
	}

}
