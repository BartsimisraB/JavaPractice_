import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		int max = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("�̸� �Է�");
			String str = sc.next();

			System.out.println("���� �Է�");
			int b = sc.nextInt();

			h.put(str, b);
		}
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();

		String name = null;
		while (it.hasNext()) {
			String str2 = it.next();
			if (max < h.get(str2)) {
				name = str2;
				max = h.get(str2);
			}
		}
		System.out.println("���̰� ���� ���� ����� " + name + " : " + max + "�� �̴�.");
	}
}
