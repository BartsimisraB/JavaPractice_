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
		
		System.out.println(brand + " " + getsize() + "인치" + " Tv");
	}
	
	
}
public class Main2 {

	public static void main(String[] args) {
		Tv1 t = new Tv1(20, "삼성");

		t.show(); // 삼성 20인치 Tv 출력
	}
}
