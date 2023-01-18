package Day13_Java;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
//		5개 정수를 입력받아 합을 구하는 프로그램.
//		만약, 정수를 아닌 문자를 입력할 때 발생하는 
//		InputMismatchException예외를 처리하여 다시 입력받도록 작성해라.
//
//		실행 결과) 1번째 정수: 1
//		2번째 정수: a
//		다시 입력해라. 정수아니다.
//		2번째 정수 : 2
//		3번째 정수 : 3
//		4번째 정수: 4
//		5번째 정수: 5 
//		총합: 15

		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int sum = 0;
		for(int i = 0 ; i < 5; i++) {
			try {
				System.out.println(cnt + "번째 정수 :");
				cnt++;
				int a = sc.nextInt();
				sum += a;

			} catch (Exception e) {
				cnt--;
				i--;
				System.out.println("다시 입력해라. 정수 아니다.");
				sc.next();
			}
		}
		System.out.println("총합 : " + sum);
		sc.close();
	}
}
