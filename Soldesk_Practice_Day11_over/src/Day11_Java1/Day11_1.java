package Day11_Java1;

class A {
	A() {
		System.out.println("A1");
	}

	A(int n) {
		System.out.println("A2");
	}
}

class B extends A {

	B() {
		System.out.println("B1");
	}

	B(int n) {	
		System.out.println("B2");
		// 자식클래스의 생성자에 대해 부모클래스의 생성자를
		// 명시적으로 선택하지 않았을 때
	}
}

public class Day11_1 {

	public static void main(String[] args) {

		B b = new B(10);	// 자식 생성자의 파라미터 값 출력, 이전에 부모 클래스의 기본 생성자 출력

	}
}
// 자바에서 클래스 다중상속 불가능 => 인터페이스
//
// -부모 클래스의 멤버에 대한 자식 클래스 접근
// 1. 부모클래스의 private멤버
// -> 자식 클래스에서 접근(X)
//
// 2. 부모클래스의 디폴드 멤버
// -> 자식 클래스에서 접근(O), 동일한 패키지에 있을때
//
// 3. 부모클래스의 public 멤버
// -> 자식 클래스에서 항상 접근(O)
//
// 4. 부모클래스의 protected 멤버
// -> 패키지 여부와 상관없이 자식 클래스에서는 접근(O)
// -> 같은 패키지 내의 모든 클래스 접근 허용
