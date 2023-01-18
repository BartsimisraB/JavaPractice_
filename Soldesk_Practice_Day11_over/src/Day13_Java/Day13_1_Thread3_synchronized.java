package Day13_Java;
class Share {
	synchronized void pr(String str) {	
		//synchronized : 스레드 간의 간섭을 차단
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
class Th1 extends Thread {
	Share s;
	String [] a;
	
	Th1(Share s, String [] a) {
		this.s = s;
		this.a = a;
	}
	
	public void run() {
		for(int i = 0; i < a.length; i++) {
			s.pr(a[i]);
		}
	}
}
public class Day13_1_Thread3_synchronized {
	public static void main(String[] args) {
		
		Share s = new Share();
		
		String eng[] = { "java", "study", "db", "spring", "jsp" };
		String kor[] = { "자바", "공부", "데이터베이스", "스프링", "제이에스피" };
	
		Th1 t1 = new Th1(s,eng);
		Thread t2 = new Th1(s,kor); 
		
		t1.start();
		t2.start();
		
	
	}
}
