package Day11_Java1;

import java.util.Scanner;

class Score {
	Scanner sc = new Scanner(System.in);
	
	int math;
	int eng;
	int com;
	
	Score (int math, int eng, int com){
		this.math = sc.nextInt();
		this.eng = sc.nextInt();
		this.com = sc.nextInt();
	}
	double avg() {
		return (math + eng + com)/3;
	}
}
public class Main2 {
	public static void main(String[] args) {
//		(math, eng, com) 점수를 입력받아 구현
		int math = 0;
		int eng = 0;
		int com = 0;
		Score s= new Score(math, eng, com);

		System.out.printf("평균은 %d",(int)s.avg());
	}
}