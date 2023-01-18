package Day14_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class A1_ArrayList {
	public static void main(String[] args) {

		ArrayList<String> p = new ArrayList<String>();
		// ArrayList 안에는 String 형만 입력 가능
		Scanner sc = new Scanner(System.in);

		// 3개 문자열을 ArrayList에 추가한다.
		for (int i = 0; i < 3; i++) {
			p.add(sc.next());
		}

		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));

		}

		int max = 0;

		for (int i = 1; i < p.size(); i++) {
			if (p.get(max).length() < p.get(i).length()) { // 문자열 길이 length()
				max = i;
			}
		}
		System.out.println("길이가 제일 긴 문자열 : " + p.get(max));
	}
}
