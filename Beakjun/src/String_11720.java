import java.util.Scanner;

public class String_11720 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		
		String str = sc.next();	//���� ���� ���� �Է�
		
		sc.close();
		
		for (int i = 0; i < n; i++) {
			sum += str.charAt(i)-'0';	//���� ���� �Էµ� ���ڵ��� ��
		}
		System.out.println(sum);
	}
}
