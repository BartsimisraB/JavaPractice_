class MovieThread extends Thread {
	public void run() {
		for(int i = 0 ; i < 3; i++) {
			System.out.print("��ȭ�� ����մϴ�. ");
		}
		System.out.println();
	}
}
class MusicThread extends Thread {
	public void run() {
		for(int i = 0 ; i < 3; i++) {
			System.out.print("������ ����մϴ�. ");
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
//������) ��ȭ�� ����մϴ�. ��ȭ�� ����մϴ�. ��ȭ�� ����մϴ�.
//		  ������ ����մϴ�. ������ ����մϴ�. ������ ����մϴ�.
//(th2�� ���� ���ü��� ����, ������ ���)