package Day14_Java;

public class B4 {
	public static void main(String[] args) {
//		1~100���� �������Է¹޾� 3,6,9 �� �ϳ��� �ִ� ��� ��¦��, �� �� �ִ� ��� ��¦¦��,
//		�ϳ��� ������ ������������ض�. 
//		(�������� 39��� �� ��, n/10=3, n%10=9 �� ���´�. (/, % ������ Ȱ��))
//		���� ���) �Է�:39 
//		¦¦

		int a = (int) (Math.random() * 99) + 1;
		System.out.println("�Է� : " + a);
		int ten = a / 10;
		int ten_mod = a % 10;
		if (a < 10) {
			System.out.println(a % 3 == 0 ? "¦" : "��");
		} else {
			System.out.println(ten % 3 == 0 && ten_mod % 3 == 0 ? "¦¦" : "��");
			if (ten % 3 == 0 ^ ten_mod % 3 == 0) {
				System.out.println("¦");
			}
		}
//		if (a > 10) {
//			if (((a / 10) == 3 ^ (a / 10) == 6 ^ (a / 10) == 9) && ((a % 10) == 3 ^ (a % 10) == 6 ^ (a % 10) == 9)) {
//				System.out.println("¦¦");
//			}
//			else if(((a / 10) == 3 ^ (a / 10) == 6 ^ (a / 10) == 9) ^ ((a % 10) == 3 ^ (a % 10) == 6 ^ (a % 10) == 9)) {
//				System.out.println("¦");
//			}
//			else if (a  != 3 ^ a != 6 ^ a != 9) {
//				System.out.println("��");
//			}
//		} else {
//			if (a == 3 ^ a == 6 ^ a == 9) {
//				System.out.println("¦");
//			} else if (a  != 3 ^ a != 6 ^ a != 9) {
//				System.out.println("��");
//			}
//		}
	}
}
