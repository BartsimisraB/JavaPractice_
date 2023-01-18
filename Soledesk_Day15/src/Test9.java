import java.util.Iterator;
import java.util.LinkedList;

public class Test9 {
	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("one");
		ls.add("two");
		ls.add("three");
	
		Iterator<String> it = ls.iterator();
		while(it.hasNext()) {
			String str = it.next();
			if(str.compareTo("three") == 0) {
				it.remove();
			}
		}
			
		it = ls.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	
	}
}
