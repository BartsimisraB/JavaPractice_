package Day13_Java;

import java.util.Scanner;

abstract class Calc {
	double op1;
	double op2;

	void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	abstract double calculate();
}

class Add extends Calc {
	Add(double a, double b) {
		set(a, b);
	}

	double calculate() {
		return op1 + op2;
	}
}

class Sub extends Calc {
	Sub(double a, double b) {
		set(a, b);
	}

	double calculate() {
		return op1 - op2;
	}

}

class Mul extends Calc {
	Mul(double a, double b) {
		set(a, b);
	}

	double calculate() {
		return op1 * op2;
	}
}

class Div extends Calc {
	Div(double a, double b) {
		set(a, b);
	}

	double calculate() {
		double c = 0;
		if (op1 != 0 || op2 == 0) {
			c = op2 / op1;
		} else if (op2 != 0 || op1 == 0) {
			c = op1 / op2;
		}
		return c;
	}
}

public class Main8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calc c1 = null;
		System.out.println("첫번째 숫자 입력 :");
		double a = sc.nextInt();
		System.out.println("두번째 숫자 입력 :");
		double b = sc.nextInt();

		System.out.println("연산자 입력 ( + , - , * , / )");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case '+':
			c1 = new Add(a, b);
			System.out.println(c1.calculate());
			break;
		case '-':
			c1 = new Sub(a, b);
			System.out.println(c1.calculate());
			break;
		case '*':
			c1 = new Mul(a, b);
			System.out.println(c1.calculate());
			break;
		case '/':
			c1 = new Div(a, b);
			System.out.printf("%.2f",c1.calculate());
			break;
		default:
			break;
		}
	}

}