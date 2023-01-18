package Day13_Java;
class Book {
	String a;
	String b;
	
	Book ()	{
		System.out.println("생성자 호출!");
	}
	Book (String a, String b) {
		this.a = a;
		this.b = b;
		System.out.println(a + " " + b);
	}
	Book (String a) {
		this(a,"작가미상");
//		System.out.println(a + " 작가 미상");
	}
	
}
public class Main1 {
	public static void main(String[] args) {
		Book b1=new Book("멋진 신세계", "올더스 헉슬리");

		Book b2=new Book("더 해빙");

		Book b3=new Book();
	}
}
