import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMap3 {
	public static void main(String[] args) {
		
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("computer", "��ǻ��");
		h.put("coffee", "Ŀ��");
		h.put("cream", "ũ��");
		
		
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()) {	//key ���� �������� ����ϱ�
			String k = it.next();	//computer
			String v = h.get(k);	//��ǻ��
			System.out.println(k + " " + v);
		}

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("ã�� �ܾ�?");
			String st = sc.next();
			String st2 = h.get(st);
			
			if(st2 == null) {
				System.out.println(st + "�� ���� �ܾ�");
			}
			else 
				System.out.println(st2 + "");
		}
	
	}
}
