package Day14_Java;

class Gen<T> {
	T t;	//"Seoul"
	T t2;	//"busan"
	
	Gen(T t, T t2) {
		this.t = t;
		this.t2 = t2;
	}
	 T one() {
		return t;
	}
	 T two() {
		 return t2;
	 }
	 
	 Boolean three() {
		 if(t.equals(t2)) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }

}
public class B1 {
	public static void main(String[] args) {
		
		Gen<String> g = new Gen<String>("Seoul", "busan");
		
		System.out.println(g.one());	//Seoul 출력
		System.out.println(g.two());	//busan 출력
		System.out.println(g.three());	//false 출력 (두 문자열 비교)
		
		
		
	}
}
