import java.util.Scanner;

public class Function_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(cal(a));
	}

	static int cal(int a) {
		int answer = 0;
		int arr[] = new int[3];

		for (int i = 1; i <= a; i++) {
			if (i < 100) {
				answer = i;

			} else if (i >= 100 && i < 1000) {

				int n = 0, b = i;

				while (b != 0) {
					arr[n] = b % 10;
					b /= 10;
					n++;
				}

				if (arr[0] - arr[1] == arr[1] - arr[2]) {
					answer++;
				}
			}
		}
		return answer;
	}
}
