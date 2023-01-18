import java.util.Scanner;

public class String_11720 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		
		String str = sc.next();	//공백 없이 숫자 입력
		
		sc.close();
		
		for (int i = 0; i < n; i++) {
			sum += str.charAt(i)-'0';	//공백 없이 입력된 숫자들의 합
		}
		System.out.println(sum);
	}
}
