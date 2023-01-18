import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Stu {
	int a;
	String name;

	Stu(int a, String name) {
		this.a = a;
		this.name = name;
	}

	public String toString() {
		return a + "," + name;
	}

	public int hashCode() {
		return a;
	}

	public boolean equals(Object obj) {
		Stu s = (Stu) obj;
		if (s.a == this.a)
			return true;
		else
			return false;
	}
}

public class Set1 {
	public static void main(String[] args) {

		Set<Stu> s = new HashSet<Stu>();

		s.add(new Stu(11, "현오"));
		s.add(new Stu(12, "종진"));
		s.add(new Stu(11, "건용"));

		Iterator<Stu> it = s.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
