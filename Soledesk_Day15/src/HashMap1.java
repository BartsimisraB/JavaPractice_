import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		// < key , value >
		hs.put(1, "����");
		hs.put(2, "����"); // �ؽ����� ���� �޼ҵ� .put(key, value)

		System.out.println(hs.get(1)); // key���� �������� ���
		System.out.println(hs.get(2));

		HashMap<String, String> hs2 = new HashMap<String, String>();

		hs2.put("��", "water");
		hs2.put("Ŀ��", "coffee");
		hs2.put("Ƽ", "tea");

		System.out.println(hs2.get("��")); // key���� �ƴ� ���� �Է��ϸ� �ν� ����.

		Set<String> keys = hs2.keySet(); // key ���� ���� ���� Set<Key>

		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String a = it.next();
			String b = (String) hs2.get(a);
			System.out.println(a + " " + b);
		}
	}
}
