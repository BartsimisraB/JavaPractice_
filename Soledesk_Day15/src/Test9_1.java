import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Test9_1 {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");

		Iterator<Integer> it = hm.keySet().iterator();
		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println(hm.get(sc.nextInt()));
	}
}
