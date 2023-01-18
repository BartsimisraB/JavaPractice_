package Day13_Java;
class Th extends Thread {
	String str;
	
	Th(String str, int n) {
		this.str = str;
		setPriority(n); //������ �켱���� ����
	}
	
	public void run() {
		System.out.println(str);
		System.out.println(getPriority());
		//�������� �켱����
	}

}
public class Day13_1_Thread2 {
	public static void main(String[] args) {
		//�������� �켱���� ���ϱ�
		Th t1 = new Th("�ǿ�", Thread.MAX_PRIORITY);
		Th t2 = new Th("����", Thread.MIN_PRIORITY);
		Th t3 = new Th("����", Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
	}
}
