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
		System.out.println(a + "는 " + b +"원");
	}
	
}

public class B3 {
	public static void main(String[] args) {

		Book b1 = new Book("자바");

		b1.title(); // 자바는 40000원

		Book b2 = new Book("파이썬", 30000);

		b2.title(); // 파이썬 30000원

	}
}
