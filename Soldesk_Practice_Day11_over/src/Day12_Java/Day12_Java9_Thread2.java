package Day12_Java;

class Th2 implements Runnable { // 
	String Th2_name;

	Th2(String name) {
		Th2_name = name;
	}

	public void run() { // ������ ���� ������ ���� �޼ҵ� / �������̵�
		for (int i = 0; i < 10; i++) {
			System.out.println(Th2_name);
			try {
				Thread.sleep(100); 
				//Runnable���� ���� �޼ҵ��̹Ƿ�
				//Thread Ŭ������ �����ؾ��Ѵ�.
			} catch (Exception e) {
			} 
		}
	}
}

public class Day12_Java9_Thread2 {
	public static void main(String[] args) {

		Th2 t = new Th2("������ 1");
		Thread t1 = new Thread(t);	//Thread ��ü ���� �� �Ű������� ���
		t1.start();
	}
}
