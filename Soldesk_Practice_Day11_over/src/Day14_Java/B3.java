package Day14_Java;

class Book {
	String a;
	int b;

	Book(String a) {
		this(a, 40000);
	}

	Book(String a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void title() {
		System.out.println(a + "�� " + b +"��");
	}
	
}

public class B3 {
	public static void main(String[] args) {

		Book b1 = new Book("�ڹ�");

		b1.title(); // �ڹٴ� 40000��

		Book b2 = new Book("���̽�", 30000);

		b2.title(); // ���̽� 30000��

	}
}
