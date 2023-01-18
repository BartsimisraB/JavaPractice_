import java.util.Scanner;

public class String_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str2 = "";
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			String str1 = sc.next();
			for(int j = 0; j < a; j++) {
				str2 += str1.charAt(j);
			}
			System.out.println(str2);
		}
	}
}
