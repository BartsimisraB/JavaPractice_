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

class GenericProgram<T> { //������ <> : ���׸� ��ȣ(angle blanket)
	// T �ڸ��� JavaŬ������ DBŬ���� � ���� �͵� ��� ����.
	T t; // DB t or Java t
	
	void in(T t) {
		this.t = t;
	}
	
	T get()	{	//String title() {return a} �� �����ǹ�
		return t;
	}
	
	
}
public class Day13_3 {
	public static void main(String[] args) {
		//T�� ���ο��� ��üȭ �ϱ�
		
		GenericProgram<Java> p = new GenericProgram<Java>();
		p.in(new Java("java"));
		Java j = p.get();
		j.show();
		
		GenericProgram<DB> d = new GenericProgram<DB>();
		d.in(new DB(5));
		DB b = d.get();
		b.pr();
	
	
	// �÷���  �����ӿ�ũ(Vector, ArrayList, Map, Set)
	
	
	
	
	}
}
