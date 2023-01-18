import java.util.Scanner;

class Rectangle {
	private int width, height;
	
	void set(int a, int b) {
		this.width = a;
		this.height = b;
	}
	
	int area() {
		return width * height;
	}
}

public class Test3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		while (true) {
			try {
				System.out.println("너비를 입력하세요.");
				a = sc.nextInt(); // 너비
				System.out.println("높이를 입력하세요.");
				b = sc.nextInt(); // 높이
				sc.close();
				break;
			} catch (Exception e) {
				System.out.println("정수를 입력하세요.");
				sc.next();
				continue;
			}
		}
		
		Rectangle rc = new Rectangle();
		rc.set(a, b);
		System.out.println(rc.area());
	
	
	}
}
