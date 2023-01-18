package Day12_Java;

class Th extends Thread { // ������ Ŭ���� �ۼ� : ��ӹ޾Ƽ� ����
	String Th_name;

	Th(String name) {
		Th_name = name;
	}

	public void run() { // ������ ���� ������ ���� �޼ҵ� / �������̵�
		for (int i = 0; i < 10; i++) {
			System.out.println(Th_name);
			try {
				sleep(100);	//0.1�� ���� ������ ���߰ڴ�.
			} catch (Exception e) { }// sleep()�� ���ܰ� �߻��� �� �ִ�.
		}
	}

}

public class Day12_Java9_Thread {
	public static void main(String[] args) {

		// ���μ��� : ���� ���� ���α׷�

		// ������(thread)
		// ���μ��� ������ ������ �۾��� �����ϴ� ��ü
		// ��� ���μ����� �� �� �̻��� �����尡 �����Ѵ�.
		// �ΰ� �̻��� �����带 ������ ���μ����� ��Ƽ�������� �Ѵ�.

		// ������ ����
		// 1. Runnable �������̽� ����
		// 2. Thread Ŭ������ ���

		Th t = new Th("������ 1");
		Th t2 = new Th("������ 2");

		t.start(); // ������� �۵� ���� (JVM�� ���� �����ٵǱ� ������)
		t2.start(); // run() �޼ҵ� �����ϰ� �ϴ� �޼ҵ�

	}
}
