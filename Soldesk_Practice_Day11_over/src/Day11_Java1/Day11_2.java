package Day11_Java1;

import java.util.Scanner;

abstract class Circle{
	protected double r;
	
	Circle(double r){
		this.r = r;
	}
	abstract double get();
}
class Cir extends Circle{
	Cir (double r) {
		super(r);
	}
	double get() {
		return r;
	}
}


public class Day11_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle [] a = new Circle[5];
		
		for (int i = 0; i < a.length; i++) {
			double r = sc.nextDouble();
			a[i]=new Cir(r);	//객체 생성
			// Circle의 객체이지만 Circle은 추상 클래스라서 객체를 만들지 못하니
			// 자식 클래스를 통해서 객체 생성
			//Circle a[] = new Cir(r); upcasting
			System.out.println(a[i].get());
		}
	}
}
