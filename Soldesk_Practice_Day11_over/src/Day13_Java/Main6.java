package Day13_Java;
interface Po {
	public void pr(int i, String name);
	public void pr(String name);
}
class Point implements Po {
	
	@Override
	public void pr(int a, String b) {
		System.out.println(b + "Ã¥Àº " + a + "¿ø");
	}

	@Override
	public void pr(String name) {
		System.out.println(name);
	}
}
public class Main6 {
	public static void main(String[] args) {
		
		Po p=new Point();

		p.pr(30000,"java"); 

		p.pr("python"); 
	}
}
