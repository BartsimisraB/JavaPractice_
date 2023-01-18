package Day14_Java;

import java.util.Scanner;

class Show implements Cal {

	@Override
	public int cal(int a, int b) {
		return a + b;
	}
	
}
public class B2 {
	public static void main(String[] args) {
		
		Cal c = new Show();
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(c.cal(a,b));
	}
}
