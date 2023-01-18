import java.util.Scanner;

public class BasicMath_1712 {
	public static void main(String[] args) {
		// 고정비용A + (가변비용 B * 노트북 생산 수 n) < 판매 비용 * 노트북 생산 수n
		// n(판매 비용 - 가변비용) > 고정비용
		// n == 고정비용 /(판매비용 - 가변비용)+1 >>>> 이익이 발생하는 시점
		// 판매비용 < 가변비용 >>>>>>> 손익분기점이 존재하지 않는 경우
		Scanner sc = new Scanner(System.in);

		int fix = sc.nextInt(); // 고정 비용
		int made = sc.nextInt(); // 가변 비용
		int sell = sc.nextInt(); // 판매 비용
		long n = 0; // 노트북 생산 수

		sc.close();

		while (true) {

			n++;

			if (sell < made) {
				System.out.println(-1);
				break;
			} else {
				n = (fix / (sell - made)) + 1;
				System.out.println(n);
				break;
			}
		}
	}
}