package Day13_Java;

class Circle {
	int r;

	Circle(int r) {
		this.r = r;
	}

	public String toString() {
		return r + " ";
	}

	public boolean equals(Object obj) { // 업 캐스팅

		if (this.r == ((Circle) obj).r) {
			return true;
		}
		return false;
	}
}
public class Main5 {
	public static void main(String[] args) {
		
		Circle a = new Circle(30);
		Circle b = new Circle(30);

		System.out.println("반지름" + a);
		System.out.println("반지름" + b);
		//toString 자동 호출

		if (a.equals(b)) {
			System.out.println("같은 원");
		}
		else {
			System.out.println("다른 원");
		}
	}
}
