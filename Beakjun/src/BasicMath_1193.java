import java.util.Scanner;

public class BasicMath_1193 {
	public static void main(String[] args) {

		// 1/1 ||| 1/2 2/1 ||| 1/3 2/2| 3/1 ||| 1/4 2/3 3/2 4/1... 분자는 1증, 분모는 1감
		// 분모가 1이 되면 최대값 증가 후 반복
		// 입력값 범위 + 분모, 분자의 최대값 == 다음 범위
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int range=0;
		int num = 0; // 분모, 분자의 최대값
		int up = 1;
		int down =1;
		int max; // 최대값 선언
		if(a ==1) {
			System.out.println(1+"/"+1);
		}else {
		while (true) {
			for(int i=0; i<a;i++) {
				
			if(down==1) {
			num++;
			break;

			
			}

		}
			System.out.println(range);
		}
		
	}
}
}