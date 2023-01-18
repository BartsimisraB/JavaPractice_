package Day11_Java1;

interface Food {
	public String name();
}

class Pizza implements Food { // 오버라이딩
	@Override	//주석처럼 표시하기
	public String name() {
		return "피자";
	}
}

class Steak implements Food { // 오버라이딩
	@Override
	public String name() {
		return "스테이크";
	}
}

public class Day11_6_InterFace3 {
	static void pr(Food f) { // Food f = new Pizza(); 업캐스팅
		System.out.println(f.name());
	}

	public static void main(String[] args) {

		pr(new Pizza());//pr 에서 f.name()으로 이름에 접근하는데 피자 클래스에서 리턴이 피자이기 때문에 피자 출력
		pr(new Steak());
	}
}
