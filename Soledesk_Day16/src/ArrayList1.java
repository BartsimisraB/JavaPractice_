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

		Iterator<Integer> i = v.iterator(); // ArrayList v�� ��Ҹ� ���� �˻��� Iterator ��ü ����
		while(i.hasNext()) {	//���ͷ����͸� ���ؼ� ���� ��� ���� �� ������ true ������ false �����ؼ� �ݺ��� ����
			int it = i.next();	//�� ���� it ��� Ÿ���� Integer�̹Ƿ� ���� ����
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
		 * ArrayList<XY> v = new ArrayList<XY>(); //ArrayList ��ü�� ���� v.add(new XY(2,
		 * 3)); v.add(new XY(4, 5)); v.add(new XY(6, 7));
		 * 
		 * v.remove(0);
		 * 
		 * for (int i = 0; i < v.size(); i++) { XY x = v.get(i); System.out.println(x);
		 * }
		 */
	}
}