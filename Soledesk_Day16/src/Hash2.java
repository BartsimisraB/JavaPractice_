import java.util.HashMap;

public class Hash2 {
	public static void main(String[] args) {
		
		HashMap<String, String> a =new HashMap<String, String>();
		
		a.put("aa", "123");
		a.put("bb", "5253");
		a.put("cc", "345425");
		
		String str = a.get("aa");
		System.out.println(str);
		
		
		
	}
}
