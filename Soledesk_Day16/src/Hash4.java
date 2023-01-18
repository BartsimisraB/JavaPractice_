import java.util.HashSet;
import java.util.Iterator;

public class Hash4 {
	public static void main(String[] args) {
		
		HashSet<Integer> v = new HashSet<Integer>();
		
		v.add(new Integer(4));
		v.add(14);
		v.add(24);
	
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			int a = it.next();
			System.out.println(a);
		}
	
	
	}	
}
