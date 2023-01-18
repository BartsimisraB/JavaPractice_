package Day11_Java1;
interface Addin{
	
	public int add(int a, int b);	//public abstract int add(int a, int b)로 안적는 이유는
	public int add(int a);	// 인터페이스에서는 생략 가능하기 때문
	
	default void pr(){	//자바 8에 추가된 디폴트 메소드
		System.out.println("히히 못가");
	}
	// default라는 예약어를 적지 않으면 전부 추상 메소드로 인식!!
}
class Add implements Addin{

	@Override
	public int add(int a, int b) {	//인터페이스의 추상메소드의 형식을 그대로 가져와 오버라이딩 해야한다.
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int add(int a) {	//오버로딩 : 함수명이 같을 때 매개변수의 유형과 개수를 다르게 하기.
		int sum = 0;
		for (int i = 0; i<= a; i++) {
			sum += i;
		}
		return sum;
	}
}
public class Day11_5_InterFace {
	public static void main(String[] args) {
			
		Add a = new Add();
		System.out.println(a.add(1, 4));
		System.out.println(a.add(10));
		a.pr();
	}
}
