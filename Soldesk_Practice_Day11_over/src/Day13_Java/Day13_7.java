package Day13_Java;

abstract class Profile2 {

	abstract void add(String name, String id);

	abstract String check(String id);

}

class Person {
	String name, id;

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
}

class Per extends Profile2 {
	Person[] ary;
	int n;

	Per(int n) {
		ary = new Person[n];
	}

	@Override
	void add(String name, String id) {
		ary[n] = new Person(name, id);
		n++;
	}

	@Override
	String check(String id) {
		for (int i = 0; i < ary.length; i++) {
			if (id.compareTo(ary[i].getId()) == 0) {
				return ary[i].getName();
			}
		}
		return null;
	}

}

public class Day13_7 {

	public static void main(String[] args) {

		Per p = new Per(5);
		p.add("건용", "123"); // ary[0].name ary[0].id
		p.add("건상", "456");
		p.add("현오", "789");

		
		System.out.println(p.check("123"));
		System.out.println(p.check("456"));
		System.out.println(p.check("789"));
	}
	
}
