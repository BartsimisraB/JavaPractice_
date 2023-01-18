import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	int num;
	String name;

	Person(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public int hashCode() {
		return num;
	}
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if(num == p.num) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Main6 {
	public static void main(String[] args) {
		Set<Person> s = new HashSet<Person>();

		s.add(new Person(12, "È«±æµ¿"));

		s.add(new Person(23, "±è±æµ¿"));

		s.add(new Person(12, "ÀÌ±æµ¿"));

		Iterator<Person> it = s.iterator();

		while (it.hasNext()) {

			Person p = it.next();

			System.out.println(p.num + " " + p.name);

		}
	}
}
