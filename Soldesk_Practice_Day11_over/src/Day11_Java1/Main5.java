package Day11_Java1;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {

//		�� ����� ������������ �Ѵ�. ����,����,�� �� �ϳ��� ���ڿ��� 
//		�Է¹޾� ���� �̰���� �Ǵ��ϴ� ���α׷����ۼ��ض�.(��ø if�� ����ؾ���, ���ڿ� ��) 
//		������) ���� : ����
//	 			ö�� : ��
//				ö���� �̰��.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String str1 = sc.nextLine();
		System.out.print("ö�� : ");
		String str2 = sc.nextLine();

		if (str1.equals("����")) {
			if (str2.equals("����")) {
				System.out.println("ö���� �̰��.");
			} else if (str2.equals("��")) {
				System.out.println("������ �̰��.");
			} else {
				System.out.println("����.");
			}
		} else if (str1.equals("����")) {
			if (str2.equals("��")) {
				System.out.println("ö���� �̰��.");
			} else if (str2.equals("����")) {
				System.out.println("������ �̰��.");
			} else {
				System.out.println("����.");
			}
		} else if (str1.equals("��")) {
			if (str2.equals("����")) {
				System.out.println("ö���� �̰��.");
			} else if (str2.equals("����")) {
				System.out.println("������ �̰��.");
			} else {
				System.out.println("����.");
			}
		}

	}

}
