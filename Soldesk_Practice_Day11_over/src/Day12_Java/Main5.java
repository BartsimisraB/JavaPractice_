package Day12_Java;

interface Re {
	default void show() {
		System.out.println("사각형!!");
	}

	int area();
}

class Rec implements Re {
	private int a, b;

	Rec(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int area() {
		return a * b;
	}
}

public class Main5 {
	public static void main(String[] args) {
		Re r = new Rec(10, 20);

		r.show(); // "사각형!!" 출력

		System.out.println("면적" + r.area());
	}
}
