package Day11_Java1;

import java.util.Scanner;

class Circle1 {
	private double r;

	Circle1(double r){
		this.r=r;
	}

	double area() {
		return 3.14 * r * r;
	}
}

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		Circle1 c[] = new Circle1[5];	//Circle1의 인스턴스가 5개
		
		for (int i = 0; i < c.length; i++) {//Circle1 c = new Circle1()을 5개 만들것이다.
			c[i] = new Circle1(sc.nextDouble());	//Circle의 인스턴스 c[i]에 반환형 대입
			sum += c[i].area();
		}
		System.out.println(sum);
		sc.close();
	}
}
//다음 Circle클래스를 활용하여 Circle 객체배열을 생성하고, 5개의 원 
//반지름을 입력받아 배열에저장한 후, 원의 면적의 합을 출력해라.