public class Method_4673 {

	public static void main(String[] args) {

		boolean self[] = new boolean[10001];	// self [0] �� ���� self[1] ~ self[10000]�� ����� �� �̹Ƿ� 10001����

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
			sum += number % 10; // number�� ù° �ڸ���
			number = number / 10; // ������� ù°�ڸ� �� ����
		}
		return sum; // while ������ sum �� 0�� �ɋ� ���� ���� �� sum ���� ����!
	}
}