package Day11_Java1;

class Tv {
	String brand;
	int year;
	int inch;

	Tv(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(year + "년에 "+brand+ "에서 나온 " + inch + "인치 Tv");
	}

}

public class Main1 {
	public static void main(String[] args) {
		
	Tv t = new Tv("삼성", 2022, 20);
	
	t.show();
	}
}
