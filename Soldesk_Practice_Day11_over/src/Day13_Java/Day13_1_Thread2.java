package Day13_Java;
class Th extends Thread {
	String str;
	
	Th(String str, int n) {
		this.str = str;
		setPriority(n); //스레드 우선순위 세팅
	}
	
	public void run() {
		System.out.println(str);
		System.out.println(getPriority());
		//스레드의 우선순위
	}

}
public class Day13_1_Thread2 {
	public static void main(String[] args) {
		//스레드의 우선순위 정하기
		Th t1 = new Th("건용", Thread.MAX_PRIORITY);
		Th t2 = new Th("종진", Thread.MIN_PRIORITY);
		Th t3 = new Th("형민", Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
	}
}
