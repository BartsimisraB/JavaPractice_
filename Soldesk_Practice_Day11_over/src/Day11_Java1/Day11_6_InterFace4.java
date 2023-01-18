package Day11_Java1;

interface AA {
	public void funcA();
}

interface BB {
	public void funcB();
}

interface C extends AA, BB { // 다중상속 인터페이스에서 인터페이스 상속받기
	public void funcC();
}

class D implements C {// AA, BB를 상속받은 C를 불러왔으므로 모든 메소드 가져오기

	@Override
	public void funcA() {
		System.out.println("funcA");
	}

	@Override
	public void funcB() {
		System.out.println("funcB");
	}

	@Override
	public void funcC() {
		System.out.println("funcC");

	}
}

public class Day11_6_InterFace4 {

	public static void main(String[] args) {

		D d1 = new D();
		d1.funcA();
		AA a1 = d1; // 업캐스팅 , d1을 a1으로 형변환을 해서 funcA()에 접근
		a1.funcA();

		BB b1 = d1; // 업캐스팅
		b1.funcB();

		C c1 = d1; // 업캐스팅
		c1.funcA();
		c1.funcB();
		c1.funcC();

		// 인터페이스에서 객체 생성 불가하기 때문에
		// 상속받은 클래스 D에서 객체 생성해줌.
	}
}