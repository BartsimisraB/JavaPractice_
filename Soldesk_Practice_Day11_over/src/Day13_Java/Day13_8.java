package Day13_Java;

import java.util.Vector;

public class Day13_8 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(5));
		v.add(5);
		v.add(10);
		v.add(0, 20);	//�ε��� 0�� 20�ְڴ�.
	
	System.out.println("���� ���� " + v.size());
	
	for (int i = 0; i < v.size(); i++) {
		int num = v.get(i);
		// Integer num = (Integer)v.get(i) ������
		// ���� ��ڽ��� ����� ���� �ʾƵ� �ȴ�.
		System.out.println(num);
	}
	}
}
