class MovieThread extends Thread {
	public void run() {
		for(int i = 0 ; i < 3; i++) {
			System.out.print("영화를 재생합니다. ");
		}
		System.out.println();
	}
}
class MusicThread extends Thread {
	public void run() {
		for(int i = 0 ; i < 3; i++) {
			System.out.print("음악을 재생합니다. ");
		}
	}
}
public class Main_1 {
	public static void main(String[] args) {
		Thread th1 = new MovieThread();

		th1.start();

		Thread th2 = new Thread(new MusicThread());

		th2.start();
	}
}
//실행결과) 영화를 재생합니다. 영화를 재생합니다. 영화를 재생합니다.
//		  음악을 재생합니다. 음악을 재생합니다. 음악을 재생합니다.
//(th2가 먼저 나올수도 있음, 세번씩 출력)