package Day14_Java;

import java.util.ArrayList;
import java.util.Iterator;
public class A9_3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> integer = new ArrayList<Integer>();
		integer.add(10);
		integer.add(20);
		integer.add(30);
		
//		for(int i = 0; i < integer.size(); i++) {
//			System.out.println(integer.get(i));
//		}
		Iterator<Integer> it = integer.iterator();
		while(it.hasNext()) {
			int n = it.next();	//���� �����͸� n�� ����
			System.out.println(n);
		}
	}
}
