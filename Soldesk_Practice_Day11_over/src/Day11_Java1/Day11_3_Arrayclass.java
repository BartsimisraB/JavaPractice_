package Day11_Java1;

class Arr{

	static int[] con(int[] ary1, int[] ary2) {
		int arr []= new int [ary1.length + ary2.length];
		
		for (int i = 0; i < arr.length; i++) {
			if(i < 4) 
				arr[i]=ary1[i];
			else 
				arr[i]=ary2[i-ary1.length];
		}
		return arr;
	}
	static void pr(int []arr) {
		for(int a : arr)
		System.out.println(a);
	}
	
}
public class Day11_3_Arrayclass {
	public static void main(String[] args) {
		
		int ary1[]= {1,2,3,4};
		int	ary2[]= {5,6,7,8};
		
		int ary3[]= Arr.con(ary1,ary2);	//클래스 명에 접근하기 때문에 static
		Arr.pr(ary3);
	}
}
