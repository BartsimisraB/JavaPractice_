package Day14_Java;

class Circle1 {

	private double x, y;

	private int r;

	Circle1(double x, double y, int r) {

		this.x = x;
		this.y = y;
		this.r = r;
	}

	void show() {

		System.out.println("x, y, r : " + x + " " + y + " " + r);
	}
}

public class A7_ {
	public static void main(String[] args) {

		Circle1 c1 [] = new Circle1[3];
		
		c1 [0] = new Circle1(1.0, 1.0, 4);
		c1 [1] = new Circle1(2.5, 3.5, 6);
		c1 [2] = new Circle1(4.2, 1.2, 4);
		
		for(int i = 0; i < 3; i++) {
			c1[i].show();
		}
		
		
	}
}
