package Day13_Java;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
//		5�� ������ �Է¹޾� ���� ���ϴ� ���α׷�.
//		����, ������ �ƴ� ���ڸ� �Է��� �� �߻��ϴ� 
//		InputMismatchException���ܸ� ó���Ͽ� �ٽ� �Է¹޵��� �ۼ��ض�.
//
//		���� ���) 1��° ����: 1
//		2��° ����: a
//		�ٽ� �Է��ض�. �����ƴϴ�.
//		2��° ���� : 2
//		3��° ���� : 3
//		4��° ����: 4
//		5��° ����: 5 
//		����: 15

		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int sum = 0;
		for(int i = 0 ; i < 5; i++) {
			try {
				System.out.println(cnt + "��° ���� :");
				cnt++;
				int a = sc.nextInt();
				sum += a;

			} catch (Exception e) {
				cnt--;
				i--;
				System.out.println("�ٽ� �Է��ض�. ���� �ƴϴ�.");
				sc.next();
			}
		}
		System.out.println("���� : " + sum);
		sc.close();
	}
}
