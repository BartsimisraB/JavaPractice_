package Day12_Java;

class Th2 implements Runnable { // 
	String Th2_name;

	Th2(String name) {
		Th2_name = name;
	}

	public void run() { // 스레드 실행 시작의 메인 메소드 / 오버라이딩
		for (int i = 0; i < 10; i++) {
			System.out.println(Th2_name);
			try {
				Thread.sleep(100); 
				//Runnable에는 없는 메소드이므로
				//Thread 클래스로 접근해야한다.
			} catch (Exception e) {
			} 
		}
	}
}

public class Day12_Java9_Thread2 {
	public static void main(String[] args) {

		Th2 t = new Th2("스레드 1");
		Thread t1 = new Thread(t);	//Thread 객체 선언 시 매개변수로 사용
		t1.start();
	}
}
