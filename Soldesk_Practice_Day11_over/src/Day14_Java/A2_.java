package Day14_Java;
interface Cal1{
    int total(int a, int b);	//a부터 b까지의 합 리턴
    int big(int a, int b);	//a,b중 큰 값 리턴
    }
class Calcu implements Cal1 {

	@Override
	public int total(int a, int b) {
		int sum = 0;
		if(a <= b) {
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		}
		else {
			for(int i = b; i <= a; i++ ) {
				sum += i;
			}
		}
		return sum;
	}

	@Override
	public int big(int a, int b) {
		return a > b ? a : b;
	}
	
}
public class A2_ {
	public static void main(String[] args) {
		
		Calcu c1 = new Calcu();
		
		System.out.println(c1.total(5, 10));
		System.out.println(c1.big(5, 10));
	}
}
