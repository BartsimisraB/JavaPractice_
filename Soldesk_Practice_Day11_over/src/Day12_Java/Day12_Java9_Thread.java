package Day12_Java;

class Th extends Thread { // 스레드 클래스 작성 : 상속받아서 만듦
	String Th_name;

	Th(String name) {
		Th_name = name;
	}

	public void run() { // 스레드 실행 시작의 메인 메소드 / 오버라이딩
		for (int i = 0; i < 10; i++) {
			System.out.println(Th_name);
			try {
				sleep(100);	//0.1초 동안 동작을 멈추겠다.
			} catch (Exception e) { }// sleep()시 예외가 발생할 수 있다.
		}
	}

}

public class Day12_Java9_Thread {
	public static void main(String[] args) {

		// 프로세스 : 실행 중인 프로그램

		// 스레드(thread)
		// 프로세스 내에서 실제로 작업을 수행하는 주체
		// 모든 프로세스는 한 개 이상의 스레드가 존재한다.
		// 두개 이상의 스레드를 가지는 프로세스를 멀티스레드라고 한다.

		// 스레드 생성
		// 1. Runnable 인터페이스 구현
		// 2. Thread 클래스를 상속

		Th t = new Th("스레드 1");
		Th t2 = new Th("스레드 2");

		t.start(); // 스레드로 작동 시작 (JVM에 의해 스케줄되기 시작함)
		t2.start(); // run() 메소드 시작하게 하는 메소드

	}
}
