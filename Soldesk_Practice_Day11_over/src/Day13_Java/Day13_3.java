package Day13_Java;

class Java {
	String title;

	Java(String t) {
		title = t;
	}

	void show() {
		System.out.println(title);
	}
}

class DB {
	int n;

	DB(int n) {
		this.n = n;
	}

	void pr() {
		System.out.println(n);
	}
}

class GenericProgram<T> { //모형자 <> : 제네릭 기호(angle blanket)
	// T 자리에 Java클래스나 DB클래스 어떤 것이 와도 상관 없다.
	T t; // DB t or Java t
	
	void in(T t) {
		this.t = t;
	}
	
	T get()	{	//String title() {return a} 와 같은의미
		return t;
	}
	
	
}
public class Day13_3 {
	public static void main(String[] args) {
		//T를 메인에서 구체화 하기
		
		GenericProgram<Java> p = new GenericProgram<Java>();
		p.in(new Java("java"));
		Java j = p.get();
		j.show();
		
		GenericProgram<DB> d = new GenericProgram<DB>();
		d.in(new DB(5));
		DB b = d.get();
		b.pr();
	
	
	// 컬렉션  프레임워크(Vector, ArrayList, Map, Set)
	
	
	
	
	}
}
