package Day12_Java;

class Tv {

	private int size;

	Tv(int size) {

		this.size = size;
	}

	protected int getsize() {

		return size;
	}
	

}
class Tv1 extends Tv {
	String brand;
	
	Tv1(int inch, String brand) {
		super(inch);
		this.brand = brand;
	}
	
	public void show() {
		
		System.out.println(brand + " " + getsize() + "��ġ" + " Tv");
	}
	
	
}
public class Main2 {

	public static void main(String[] args) {
		Tv1 t = new Tv1(20, "�Ｚ");

		t.show(); // �Ｚ 20��ġ Tv ���
	}
}
