import java.util.Scanner;

public class BasicMath_1712 {
	public static void main(String[] args) {
		// �������A + (������� B * ��Ʈ�� ���� �� n) < �Ǹ� ��� * ��Ʈ�� ���� ��n
		// n(�Ǹ� ��� - �������) > �������
		// n == ������� /(�Ǹź�� - �������)+1 >>>> ������ �߻��ϴ� ����
		// �Ǹź�� < ������� >>>>>>> ���ͺб����� �������� �ʴ� ���
		Scanner sc = new Scanner(System.in);

		int fix = sc.nextInt(); // ���� ���
		int made = sc.nextInt(); // ���� ���
		int sell = sc.nextInt(); // �Ǹ� ���
		long n = 0; // ��Ʈ�� ���� ��

		sc.close();

		while (true) {

			n++;

			if (sell < made) {
				System.out.println(-1);
				break;
			} else {
				n = (fix / (sell - made)) + 1;
				System.out.println(n);
				break;
			}
		}
	}
}