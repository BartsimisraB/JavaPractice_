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
public class Day11_Java2 {

	public static void main(String[] args) {
		
		B b = new B();
	}
}
