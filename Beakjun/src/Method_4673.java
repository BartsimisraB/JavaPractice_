public class Method_4673 {

	public static void main(String[] args) {

		boolean self[] = new boolean[10001];	// self [0] 은 비우고 self[1] ~ self[10000]를 사용할 것 이므로 10001설정

		for (int i = 1; i <= 10000; i++) {	//
			int n = d(i); 

			if (n <= 10000) {
				self[n] = true; 
			}
		}
		for (int i = 1; i <= 10000; i++) {
			if(self[i] == false) {
				System.out.println(i);
			}
		}

	}

	public static int d(int number) {
		int sum = number;
		while (number != 0) {
			sum += number % 10; // number의 첫째 자리수
			number = number / 10; // 나누기로 첫째자리 수 제외
		}
		return sum; // while 문에서 sum 이 0이 될떄 까지 돌린 후 sum 값을 리턴!
	}
}