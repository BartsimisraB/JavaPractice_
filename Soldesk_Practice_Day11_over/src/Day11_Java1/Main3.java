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
		
		Circle1 c[] = new Circle1[5];	//Circle1�� �ν��Ͻ��� 5��
		
		for (int i = 0; i < c.length; i++) {//Circle1 c = new Circle1()�� 5�� ������̴�.
			c[i] = new Circle1(sc.nextDouble());	//Circle�� �ν��Ͻ� c[i]�� ��ȯ�� ����
			sum += c[i].area();
		}
		System.out.println(sum);
		sc.close();
	}
}
//���� CircleŬ������ Ȱ���Ͽ� Circle ��ü�迭�� �����ϰ�, 5���� �� 
//�������� �Է¹޾� �迭�������� ��, ���� ������ ���� ����ض�.