import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		// < key , value >
		hs.put(1, "종진");
		hs.put(2, "현오"); // 해쉬맵의 삽입 메소드 .put(key, value)

		System.out.println(hs.get(1)); // key값을 기준으로 출력
		System.out.println(hs.get(2));

		HashMap<String, String> hs2 = new HashMap<String, String>();

		hs2.put("물", "water");
		hs2.put("커피", "coffee");
		hs2.put("티", "tea");

		System.out.println(hs2.get("물")); // key값이 아닌 값을 입력하면 인식 못함.

		Set<String> keys = hs2.keySet(); // key 들의 집합 생성 Set<Key>

		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String a = it.next();
			String b = (String) hs2.get(a);
			System.out.println(a + " " + b);
		}
	}
}
