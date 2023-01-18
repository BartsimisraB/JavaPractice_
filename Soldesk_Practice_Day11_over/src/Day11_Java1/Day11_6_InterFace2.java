package Day11_Java1;

interface Animal {
	public void bear();
}

interface Fish {
	public void swim();
}
class AB implements Animal, Fish{	//인터페이스는 다중상속이 가능 
	//클래스에서 인터페이스를 끌어 올 때는 끌어온 인터페이스의 모든 메소드를 가지고 와야함
	public void bear() {
		System.out.println("낳는다.");
	}
	
	public void swim() {
		System.out.println("수영한다.");
	}
	
	
}
public class Day11_6_InterFace2 {
	public static void main(String[] args) {
		
		AB ab = new AB();
		ab.bear();
		ab.swim();
		
		
		
	}
}
