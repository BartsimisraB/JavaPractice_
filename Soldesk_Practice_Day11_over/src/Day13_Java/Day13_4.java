package Day13_Java;
class AA {
	public String toString() {
		return "AA";
	}
}
class BB {
	public String toString() {
		return "BB";
	}
}
class In {
	<T> void show(T t) {	//제네릭 메소드
		System.out.println(t);
	}
	void show()	{
		System.out.println("generic");
	}
}



public class Day13_4 {
	public static void main(String[] args) {

		AA a = new AA();	//Object  t = new AA();
		BB b = new BB();
		In i = new In();
		
		i.show(a);
		i.show(b);
		i.show();
	}
}
