package Day12_Java;
class Shape {
	private int a,b;
	private String str;
	Shape(){
		this.a = 1;
		this.b = 3;
	}
	Shape(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void pr(String str) {
		this.str = str;
	}
	
	void show() {
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
	
}

public class Main3 {
	public static void main(String[] args) {
		
		Shape s = new Shape();

		Shape s1 = new Shape(2,5);

		s.pr("@"); 

		s1.pr("#");

		s.show(); //@@@-> 1행 3열로 출력

		s1.show(); //#####->2행 5열로 출력

		//#####
	}
}
