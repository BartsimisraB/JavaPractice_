package Day11_Java1;

class In {
	private int num;
	
	public In(int a){
		num = a;
	}
	public String toString() {
		return num+" ";	//문자열 코드 작성하기
	}
}


public class Day11_9_toString {

	public static void main(String[] args) {
		In i=new In(4);
		System.out.println(i);
	}
}