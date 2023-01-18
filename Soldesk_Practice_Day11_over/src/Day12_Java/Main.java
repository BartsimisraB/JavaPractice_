package Day12_Java;
//class Point {
//	int a;
//	int b;
//	
//	Point (int a, int b){
//		this.a = a;
//		this.b = b;
//	}
//	public String toString() {
//		return a+ "," +b;
//	}
//}
public class Main {
	public static void main(String[] args) {
//		Point p = new Point(3,4);
//
//		System.out.println(p); //3.4출력
//		주민번호 “841111-1234560”을 초기화하여 여성인지 남성인지 출력해
//
//		(7번째 숫자가 1이면 남성, 2이면여성 – switch case사용)
		String b = "841111-1234560";
//		String a = b.substring(7, 8);
//		int c = Integer.parseInt(a);
//		System.out.println(c);
		switch (b.charAt(7)) {
		case '1':
			System.out.println("남성");
			break;
		case '2':
			System.out.println("여성");
			break;
		}
		
	}
}
