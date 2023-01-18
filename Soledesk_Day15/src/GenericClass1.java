class Food {

	void show() {
		System.out.println("음식");
	}
}

class Pizza extends Food {
	void show() {
		super.show();
		System.out.println("피자");
	}
}

class Fo<T> {
	T t;

	void in(T t) {
		this.t = t;
	}

	T out() {
		return t;
	}
}

public class GenericClass1 {
	
	public static void pr(Fo <? extends Food>f) {	// ? 바인드 변수
		// Food로부터 상속받은 모든 클래스
		//Fo<Food>f /// Fo<Pizza>f
		
		Food fo = f.out();	//Food fo = Food.out();
		
		 fo.show();
		
	}
	
	public static void main(String[] args) {

		Fo<Food> f = new Fo<Food>();
		f.in(new Food());
		pr(f);
		
		
		Fo<Pizza> p = new Fo<Pizza>();
		p.in(new Pizza());
		pr(p);
		
		
	}
}
