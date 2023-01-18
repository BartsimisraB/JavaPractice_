
public class Main7 {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		int b[] = { 6, 7, 8, 9, 10 };

		int c = add(a, 5);

		int d = add(a, 5, b);

		System.out.println(c);

		System.out.println(d);
	}

	private static int add(int[] a, int i, int[] b) {
		int sum = 0;
		for(int in = 0; in < i; in++) {
			sum += a[in] + b[in];
		}
		return sum;
	}

	private static int add(int[] a, int i) {
		int sum = 0;
		for(int in = 0; in < i; in++) {
			sum += a[in];
		}
		return sum;
	}
}
