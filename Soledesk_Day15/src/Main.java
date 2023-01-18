import java.util.HashSet;
import java.util.Iterator;

class Num {
	int a;

	Num(int a) {
		this.a = a;
	}

	public String toString() {
		return a + " ";
	}

	public int hashCode() {
		return a;
	}
	
	public boolean equals(Object obj) {
		Num num = (Num) obj;
		if (num.a == a)
			return true;
		else
			return false;
	}
}

public class Main {
	public static void main(String[] args) {

		HashSet<Num> hs = new HashSet<Num>();

		hs.add(new Num(30));
		hs.add(new Num(40));
		hs.add(new Num(30));
		hs.add(new Num(50));
		hs.add(new Num(60));
		
		System.out.println(hs);
//		Iterator<Num> it = hs.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
}