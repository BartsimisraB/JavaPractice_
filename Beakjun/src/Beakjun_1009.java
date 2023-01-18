import java.util.Scanner;

public class Beakjun_1009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int a, b;
		for (int i = 1; i <= T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			double pow = Math.pow(a, b);
			if ((int) pow % 10 == 0) {
				System.out.println(10);
			}
			int num = a % 10;
			for (int j = 1; j < b; b++) {
				num = (num * a) % 10;
			}
			System.out.println(num);
		}

	}
}