package Day13_Java;

import java.util.Vector;

public class Day13_8 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(5));
		v.add(5);
		v.add(10);
		v.add(0, 20);	//인덱스 0에 20넣겠다.
	
	System.out.println("벡터 개수 " + v.size());
	
	for (int i = 0; i < v.size(); i++) {
		int num = v.get(i);
		// Integer num = (Integer)v.get(i) 이지만
		// 오토 언박싱을 사용해 적지 않아도 된다.
		System.out.println(num);
	}
	}
}
