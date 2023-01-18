package Day12_Java;

public class Day12_Java4_Wrapper {
	public static void main(String[] args) {

		Integer i = new Integer(10); // boxing : 기본형을 객체형으로 변환
		// int i2 = i.intValue();
		// Integer i2 = 10; //autoboxing

		int i1 = i.intValue(); // unboxing : 객체형을 기본형으로 변환
		// int 값 가져오기
		// intValue() : Integer 클래스 내부의 int 자료형 값을 가져올 때 사용

		Integer number1 = Integer.valueOf("100");
		Integer number2 = Integer.valueOf(100);
		// valueOf() 정적 메소드 : 생성자를 사용하지 않고 정수나 문자열을 바로
		// 클래스 객체로 반환 받을 수 있다.

		int num = Integer.parseInt("100");
		// parseInt() : 문자열이 어떤 숫자를 나타낼 때, 이를테면
		// 학번이나 개수 등이 문자열로 전달된 경우 문자열에서 int값을 바로 가쟈와서 반환
		// 매개변수는 항상 String형!!
		Character c = new Character('a');
		char c1 = c.charValue();

		Boolean b = new Boolean(true);
		boolean b1 = b.booleanValue();

		int i2 = Integer.parseInt("123");
		boolean b2 = Boolean.parseBoolean("true");
		double d2 = Double.parseDouble("3.14");
		System.out.println(b2);
		
		int i3 = Integer.valueOf(123);	//오토언박싱
		int i4 = Integer.valueOf("10") + Integer.valueOf("20");

		System.out.println(i4);
		
		String s = Integer.toString(123);
		//정수형 객체 123을 문자열로 반환
		System.out.println(s);
	
		Integer i11 = 100;	//auto boxing
		int n1 = i11 + 200;	//auto unboxing
		
		System.out.println(n1);
	
	
	
	}
}
