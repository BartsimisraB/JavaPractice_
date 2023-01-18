package Exercise;
class Number {
	
	public static void pr(int i) {
		System.out.println(i);
	}
	
	public void show(double d) {
		System.out.println(d);
	}
}

public class Main2 {
	public static void main(String[] args) {
		Number.pr(100);

		Number n = new Number();

		n.show(3.14);
	}
}
