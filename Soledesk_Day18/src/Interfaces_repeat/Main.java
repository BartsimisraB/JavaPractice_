package Interfaces_repeat;
	
class Student extends Thread {
	String name;
	Sh sh;

	Student(String n, Sh sh) {
		name = n;
		this.sh = sh;
	}

	public void run() {
		for (int i = 1; i < 6; i++) {
			try {
				sh.add();
				sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class Sh {
	
	public void add() {
		int n = 0;
		n += 10;
		System.out.println(n);
	}
}

public class Main {
	public static void main(String[] args) {

		Sh sh = new Sh();
		Student th1 = new Student("jack", sh);
		Student th2 = new Student("tom", sh);

		th1.start();

		th2.start();
	}
}
