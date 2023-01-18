import java.util.Scanner;

public class BasicMath_2292 {
	public static void main(String[] args) {
		// 칸수가 늘어나는 구간의 처음 : 2, 8, 20, 38... 2에 6의 배수 더한 값
		// 칸수가 늘어나는 구간의 끝 : 7, 19, 37, .... 7에 6의 배수 더한 값
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int block = 1;
		int first = 2;

		if (a == 1) {
			System.out.println(block);
		} else {
			while (first <= a) {
				first = first + (block * 6);
				block++;

			}
			System.out.println(block);
		}
	}
}