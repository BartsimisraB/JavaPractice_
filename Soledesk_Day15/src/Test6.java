import java.util.ArrayList;
import java.util.Iterator;

public class Test6 {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			int rand = (int)(Math.random()*99)+1;
			arr.add(rand); 
		}
		
		Iterator<Integer> it = arr.iterator();
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(it.next());
		}
	}
}
