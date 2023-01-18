package Day11_Java1;
class XY {
	int a,b;
	public void set(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void show() {
		System.out.println(a + " " + b);
	}
}
class XYZ extends XY {
	String color;
	public void color(String color) {
		this.color = color;
	}
	public void show() {
		System.out.println(a +" "+ b +" "+ color);
	}
}
public class Main4 {

	public static void main(String[] args) {
		XY x = new XY();

		x.set(1, 2);

		x.show(); // 1,2 출력

		XYZ xy = new XYZ();

		xy.set(4, 5);

		xy.color("blue");

		xy.show(); // 4,5,blue 출력
	}
}
