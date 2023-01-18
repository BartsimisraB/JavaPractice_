package Day12_Java;

class XY {

	private int x, y;

	XY(int x, int y) {

		this.x = x;
		this.y = y;
	}

	int getx() {

		return x;
	}

	int gety() {

		return y;
	}

	protected void move(int x, int y) {

		this.x = x;

		this.y = y;

	}
}

class XYZ extends XY {
	private String color;

	XYZ(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setxy(int a, int b) {
		super.move(a, b);
	}

	public void setcolor(String color) {
		this.color = color;
	}

	void show() {
		System.out.println(getx() + "," + gety() + "ÀÎ " + color + "»ö!");
	}
}

public class Main4 {
	public static void main(String[] args) {
		XYZ xyz = new XYZ(10, 10, "red");
		
		xyz.setxy(20, 30);

		xyz.setcolor("blue");

		xyz.show();
	}
}
