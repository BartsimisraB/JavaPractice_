package Day13_Java;

class Music extends Thread {
	String m;

	Music(String m) {
		this.m = m;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(m);
		}
	}
}

class Movie implements Runnable {
	String a;
	
	Movie(String a) {
		this.a = a;
	}
	public void run() {
			System.out.println(a);
	}
}

public class Day13_1_Thread {
	public static void main(String[] args) throws InterruptedException {

		Music m = new Music("���� ���");
		m.start();
		m.join();	// ��ȭ ����� ���� ������ ��ٸ���.

		
		Movie m1 = new Movie("��ȭ ���");
		Thread t = new Thread(m1);
		t.start();
		t.join();	// ���� ����� ���� ������ ��ٸ���.
		
		
	
	}
}
