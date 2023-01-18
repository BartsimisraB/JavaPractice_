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
	//toString() : Object(부모)클래스에서는 클래스이름@해시코드
//				   Book(자식)클래스에서 toString을 오버라이딩 했기 때문에
//				   부모클래스의 클래스이름@해시코드 작업이 무시된다.
}



public class Day11_8_toString {

	public static void main(String[] args) {
		
		Book book1 = new Book(200,"개미");
		
		System.out.println(book1);//객체(참조변수)를 출력할 때 자동으로 toString메소드 호출
//		System.out.println(book1.bookNumber+ " " +book1.bookTitle);
		
//		book1.show();
//		System.out.println(book1);
//		System.out.println(book1.toString());
	}
}