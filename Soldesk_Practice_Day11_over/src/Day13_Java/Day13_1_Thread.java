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

		Music m = new Music("음악 재생");
		m.start();
		m.join();	// 영화 재생이 끝날 때까지 기다린다.

		
		Movie m1 = new Movie("영화 재생");
		Thread t = new Thread(m1);
		t.start();
		t.join();	// 음악 재생이 끝날 때까지 기다린다.
		
		
	
	}
}
