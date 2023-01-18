import java.util.ArrayList;
import java.util.Iterator;

class XY {
	int a, b;

	XY(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return a + " " + b;

	}
}

public class ArrayList1 {
	public static void main(String[] args) {

		ArrayList<Integer> v = new ArrayList<Integer>();

		v.add(new Integer(4));
		v.add(14);
		v.add(24);

		Iterator<Integer> i = v.iterator(); // ArrayList v의 요소를 순차 검색할 Iterator 객체 리턴
		while(i.hasNext()) {	//이터레이터를 통해서 값을 계속 읽을 수 있으면 true 없으면 false 리턴해서 반복문 종료
			int it = i.next();	//값 리턴 it 요소 타입은 Integer이므로 정수 리턴
			System.out.println(it);
		}
		/*
		 * ArrayList<Integer> v = new ArrayList<Integer>();
		 * 
		 * v.add(4); v.add(4); v.add(4);
		 * 
		 * System.out.println(v.size());
		 * 
		 * for (int i = 0; i < v.size(); i++) { int a = v.get(i); System.out.println(a);
		 * }
		 */

		/*
		 * ArrayList<XY> v = new ArrayList<XY>(); //ArrayList 객체에 삽입 v.add(new XY(2,
		 * 3)); v.add(new XY(4, 5)); v.add(new XY(6, 7));
		 * 
		 * v.remove(0);
		 * 
		 * for (int i = 0; i < v.size(); i++) { XY x = v.get(i); System.out.println(x);
		 * }
		 */
	}
}