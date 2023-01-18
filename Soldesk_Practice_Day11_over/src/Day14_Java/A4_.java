package Day14_Java;

class Total {
	int sum;

	Total() {
		sum = 0;
	}

	void total(int n) {
		sum += n;
	}

	int get() {
		return sum;
	}
}

class AThread extends Thread {
	Total t;
	int a, b;

	AThread(Total t, int a, int b) {
		this.t = t;
		this.a = a;
		this.b = b;
	}

	public void run() {
		for (int i = a; i <= b; i++) {
			t.total(i);
			try {
				t.get();
			} catch (Exception e) {

			}
		}
		System.out.println(t.get());
	}

}

public class A4_ {
	public static void main(String[] args) throws InterruptedException {
		Total t = new Total();
		AThread a = new AThread(t, 1, 50);
		AThread b = new AThread(t, 51, 100);
		a.start();
		a.join();
		b.start();
		b.join();
	}
}
