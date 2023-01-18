package Day13_Java;

class Grade {
	private int english;
	private int math;
	private int science;

	Grade() {
		System.out.println("�� ������ ������ ");
	}

	Grade(int english, int math, int science) {
		this.english = english;
		this.math = math;
		this.science = science;
	}

	void get(int a, int b, int c) {
		english = a;
		math = b;
		science = c;
	}

	public double avg() {
		double avg = (english + math + science) / 3.0;
		return avg;
	}

	public void show() {
		System.out.println("���� : " + english + " ���� : " + math + " ���� : " + science);
		System.out.println("�� ������ ����� : " + avg());
	}
}

public class Main7 {

	public static void main(String[] args) {

		Grade g1 = new Grade();
		g1.get(70, 60, 80);
		g1.show();
		
		System.out.println();
		
		Grade g2 = new Grade();
		g2.get(60, 70, 80);
		g2.show();

	}
}
