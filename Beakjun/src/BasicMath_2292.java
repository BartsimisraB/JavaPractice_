import java.util.Scanner;

public class BasicMath_2292 {
	public static void main(String[] args) {
		// ĭ���� �þ�� ������ ó�� : 2, 8, 20, 38... 2�� 6�� ��� ���� ��
		// ĭ���� �þ�� ������ �� : 7, 19, 37, .... 7�� 6�� ��� ���� ��
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int block = 1;
		int first = 2;

		if (a == 1) {
			System.out.println(block);
		} else {
			while (first <= a) {
				first = first + (block * 6);
				block++;

			}
			System.out.println(block);
		}
	}
}