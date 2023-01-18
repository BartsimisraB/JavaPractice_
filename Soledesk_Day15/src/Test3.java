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
				System.out.println("�ʺ� �Է��ϼ���.");
				a = sc.nextInt(); // �ʺ�
				System.out.println("���̸� �Է��ϼ���.");
				b = sc.nextInt(); // ����
				sc.close();
				break;
			} catch (Exception e) {
				System.out.println("������ �Է��ϼ���.");
				sc.next();
				continue;
			}
		}
		
		Rectangle rc = new Rectangle();
		rc.set(a, b);
		System.out.println(rc.area());
	
	
	}
}
