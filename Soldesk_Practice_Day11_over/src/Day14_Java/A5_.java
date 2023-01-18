package Day14_Java;

interface Figure {

	void circle_area();

	void rec_area();

}

class Circle implements Figure {
	int a;

	Circle(int a) {
		this.a = a;
	}

	@Override
	public void circle_area() {
		System.out.println("�������� " + a + "�� ���� ���̴� " + a * a * 3.14);
	}

	@Override
	public void rec_area() {

	}

}

class Rec implements Figure {
	int a, b;

	Rec(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void circle_area() {

	}

	@Override
	public void rec_area() {
		System.out.println("���� " + a + " ���� " + b + "�� �簢���� ���̴� " + a * b);
	}

}

public class A5_ {
	public static void main(String[] args) {
		Figure f1 = new Circle(5);
		Figure f2 = new Rec(2, 5);
		f1.circle_area();
		f2.rec_area();
	}
}
