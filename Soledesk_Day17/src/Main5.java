public class Main5 {
	public static int[] make() {

		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}

	public static void main(String[] args) {

		int ary[];

		ary = make();

		for (int i = 0; i < ary.length; i++) {

			System.out.println(ary[i] + " ");
		}
	}
}