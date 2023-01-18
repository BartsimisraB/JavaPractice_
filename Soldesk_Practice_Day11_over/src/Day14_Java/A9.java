package Day14_Java;

abstract class Ab {
	public abstract int total(int arr[]);
}

class Cd extends Ab {

	@Override
	public int total(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
}
public class A9 {
	public static void main(String[] args) {

		Ab c = new Cd();

		System.out.println(c.total(new int[] { 1, 2, 3, 4, 5 }));
	}
}
