import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test8 {
	public static void main(String[] args) {

		Map<Integer, Double> m = new HashMap<Integer, Double>();

		m.put(10, 2.5);
		m.put(15, 3.5);
		m.put(25, 4.5);

		Set<Map.Entry<Integer, Double>> s = m.entrySet();
		
		for(Map.Entry<Integer, Double> m1 : s) {
			System.out.println(m1.getValue());
			System.out.println(m1.getKey());
		}
		
		
//		Set<Integer> key = m.keySet();
//		Iterator<Integer> it = key.iterator();
//
//		while (it.hasNext()) {
//			int i = it.next();
//			System.out.println(m.get(i));
//		}
	}
}
