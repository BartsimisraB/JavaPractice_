import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("kim", 50);
		hm.put("park", 25);
		hm.put("hong", 40);
		
		
		Set<String>key = hm.keySet();
		Iterator<String> it = key.iterator();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("누구 나이를 찾습니까?");
			String a = sc.next();
			int b = hm.get(a);
			
			if(b == -1) {
				System.out.println(a + "는 없는 이름");
			}
			else
				System.out.println(b);
		}
	}
}
