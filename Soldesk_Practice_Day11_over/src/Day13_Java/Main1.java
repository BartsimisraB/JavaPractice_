package Day13_Java;
class Book {
	String a;
	String b;
	
	Book ()	{
		System.out.println("������ ȣ��!");
	}
	Book (String a, String b) {
		this.a = a;
		this.b = b;
		System.out.println(a + " " + b);
	}
	Book (String a) {
		this(a,"�۰��̻�");
//		System.out.println(a + " �۰� �̻�");
	}
	
}
public class Main1 {
	public static void main(String[] args) {
		Book b1=new Book("���� �ż���", "�ô��� �佽��");

		Book b2=new Book("�� �غ�");

		Book b3=new Book();
	}
}
