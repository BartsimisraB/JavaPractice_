package Day11_Java;
class A{
	A(){
		System.out.println("A");
	}
}
class B extends A{
	B(){
		System.out.println("B");
	}
}
public class Day11_Java1 {

public static void main(String[] args) {
	
	
		B b = new B();
		
	}
}
//자바에서 클래스 다중상속 불가능 => 인터페이스
//
//-부모 클래스의 멤버에 대한 자식 클래스 접근
//1. 부모클래스의 private멤버
//   -> 자식 클래스에서 접근(X)
//
//2. 부모클래스의 디폴드 멤버
//   -> 자식 클래스에서 접근(O), 동일한 패키지에 있을때
//
//3. 부모클래스의 public 멤버
//   -> 자식 클래스에서 항상 접근(O)
//
//4. 부모클래스의 protected 멤버
//   -> 패키지 여부와 상관없이 자식 클래스에서는 접근(O)
//   -> 같은 패키지 내의 모든 클래스 접근 허용