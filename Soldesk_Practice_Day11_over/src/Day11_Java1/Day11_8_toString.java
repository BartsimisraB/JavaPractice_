package Day11_Java1;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber =bookNumber;
		this.bookTitle = bookTitle;
	}
	void show()	{
		System.out.println(this);
	}
	public String toString() {
		return bookNumber + " " + bookTitle;
	}
	//toString() : Object(�θ�)Ŭ���������� Ŭ�����̸�@�ؽ��ڵ�
//				   Book(�ڽ�)Ŭ�������� toString�� �������̵� �߱� ������
//				   �θ�Ŭ������ Ŭ�����̸�@�ؽ��ڵ� �۾��� ���õȴ�.
}



public class Day11_8_toString {

	public static void main(String[] args) {
		
		Book book1 = new Book(200,"����");
		
		System.out.println(book1);//��ü(��������)�� ����� �� �ڵ����� toString�޼ҵ� ȣ��
//		System.out.println(book1.bookNumber+ " " +book1.bookTitle);
		
//		book1.show();
//		System.out.println(book1);
//		System.out.println(book1.toString());
	}
}