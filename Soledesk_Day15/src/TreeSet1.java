import java.util.Iterator;
import java.util.TreeSet;

class Pro implements Comparable<Pro> {
	String a;
	int b;

	Pro(String a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void show() {
		System.out.println(a + " " + b);
	}
	
	@Override
	public int compareTo(Pro o) {	// 내림차순(작은 수부터~)
		if (b > o.b) { // 기존에 존재하던 트리의 노드들과 추가된 o.b를 비교
			return 1;
		} else if (b < o.b) {
			return -1;
		} else
			return 0;
	}
}

public class TreeSet1 {
	public static void main(String[] args) {

		TreeSet<Pro> t = new TreeSet<Pro>();

		t.add(new Pro("cc", 128));
		t.add(new Pro("aa", 123));
		t.add(new Pro("bb", 125));

		Iterator<Pro> it = t.iterator();
		while (it.hasNext()) {
			it.next().show();
		}

	}
}
