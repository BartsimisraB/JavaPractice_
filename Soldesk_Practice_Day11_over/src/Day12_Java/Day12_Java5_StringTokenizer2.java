package Day12_Java;

class Num {
	int a;

	Num(int a) {
		this.a = a;
	}

	int get() {
		return a;
	}
//	public String toString() {
//		return a + " ";
//	}
}

public class Day12_Java5_StringTokenizer2 {

	public static void main(String[] args) {

		Num[] arr = new Num[] {	new Num(1),
								new Num(2),
								new Num(3)};// ∞¥√º √ ±‚»≠
		for(Num i : arr) {
			System.out.println(i.get());
		}
	}
}
