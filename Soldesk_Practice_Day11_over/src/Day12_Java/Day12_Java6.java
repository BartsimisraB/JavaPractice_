package Day12_Java;
class Animal {
	String str;
	Animal(String str) {
		this.str = str;
	}
	String ani() {
		return str;
	}
}
class Dog extends Animal {
	String str1;
	
	Dog(String str, String str1) {
		super(str);
		this.str1 = str1;
	}
	String ani() {
		return super.ani() + " " + str1;
	}
	
}
public class Day12_Java6 {

	public static void main(String[] args) {
		
		Animal a1 = new Dog("°­¾ÆÁö", "Çªµé");
		System.out.println(a1.ani());
	}
}
