import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Hash3 {
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("이름");
			String name = sc.next();
			
			System.out.println("나이");
			int age = sc.nextInt();
			
			h.put(name, age);
		}
		
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()) {
		String str = it.next();
		int n = h.get(str);
		
		System.out.println(str + " " + n);
		}
	}
}
