import java.util.Scanner;

class Calculate {
	int a;

	int calculate(int num) {
		this.a = num;
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0) {
				sum += i;
			} else
				continue;
		}
		return sum;
	}

}

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			System.out.println("숫자 입력 :");
			num = sc.nextInt();
			if (num == 0)
				break;
			if (num >= 5 && num <= 10) {
				Calculate cal = new Calculate();
				System.out.println(cal.calculate(num));
			} else if (num < 5 || num > 10) {
				System.out.println("다시 입력");
				continue;
			}
		}
	}
}
