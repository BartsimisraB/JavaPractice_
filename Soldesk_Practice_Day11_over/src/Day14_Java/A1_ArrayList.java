package Day14_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class A1_ArrayList {
	public static void main(String[] args) {

		ArrayList<String> p = new ArrayList<String>();
		// ArrayList �ȿ��� String ���� �Է� ����
		Scanner sc = new Scanner(System.in);

		// 3�� ���ڿ��� ArrayList�� �߰��Ѵ�.
		for (int i = 0; i < 3; i++) {
			p.add(sc.next());
		}

		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));

		}

		int max = 0;

		for (int i = 1; i < p.size(); i++) {
			if (p.get(max).length() < p.get(i).length()) { // ���ڿ� ���� length()
				max = i;
			}
		}
		System.out.println("���̰� ���� �� ���ڿ� : " + p.get(max));
	}
}
