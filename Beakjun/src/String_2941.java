import java.util.Scanner;

public class String_2941 {
	public static void main(String[] args) {
		
/*	���ڿ� �迭�� ���� ũ�ξ�Ƽ�� ���ĺ��� �迭�� �� �ε����� �Է�
 *  ���ڿ��� �Է� ��  �Է¹��� ���ڿ� �ȿ� ũ�ξ�Ƽ�� ���ĺ��� �ش��ϴ��� ���ϴ� ��� �ֳ�?
 */
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String arr[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String str = sc.next();
		
		for (int i = 0; i < arr.length; i++) {
			if(str.equalsIgnoreCase(arr[i])) {
				count++;
			}
		}System.out.println(count);
	}
}
