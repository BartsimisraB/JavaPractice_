package Day13_Java;

class Circle {
	int r;

	Circle(int r) {
		this.r = r;
	}

	public String toString() {
		return r + " ";
	}

	public boolean equals(Object obj) { // �� ĳ����

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

		System.out.println("������" + a);
		System.out.println("������" + b);
		//toString �ڵ� ȣ��

		if (a.equals(b)) {
			System.out.println("���� ��");
		}
		else {
			System.out.println("�ٸ� ��");
		}
	}
}
