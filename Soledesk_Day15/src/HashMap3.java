import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMap3 {
	public static void main(String[] args) {
		
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("computer", "컴퓨터");
		h.put("coffee", "커피");
		h.put("cream", "크림");
		
		
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()) {	//key 값을 기준으로 출력하기
			String k = it.next();	//computer
			String v = h.get(k);	//컴퓨터
			System.out.println(k + " " + v);
		}

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("찾을 단어?");
			String st = sc.next();
			String st2 = h.get(st);
			
			if(st2 == null) {
				System.out.println(st + "는 없는 단어");
			}
			else 
				System.out.println(st2 + "");
		}
	
	}
}
