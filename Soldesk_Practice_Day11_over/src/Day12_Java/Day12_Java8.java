package Day12_Java;
//��ȭ��ȣ ���� ���α׷� : �б����, ���嵿�� �з��ؼ� ����

import java.util.Scanner;

class PhoneNum { // �θ� Ŭ����
	String name;
	String phone;

	public PhoneNum(String n, String p) {
		name = n;
		phone = p;
	}

	void show() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phone);
	}
}

class School extends PhoneNum { // �б� ģ��
	String major;

	School(String n, String p, String major) {
		super(n, p);
		this.major = major;
	}

	void show() { // overriding
		super.show();
		System.out.println("���� : " + major);
	}
}

class Worker extends PhoneNum {
	String grade;

	Worker(String n, String p, String grade) {
		super(n, p);
		this.grade = grade;
	}

	void show() { // overriding
		super.show();
		System.out.println("���� : " + grade);
	}
}

class Arr {

	PhoneNum[] arr; // ��ü �迭
	int n;

	Arr(int n) {
		arr = new PhoneNum[n]; // �迭 ����
		n = 0;
	}

	void add(PhoneNum p) {
		arr[n++] = p; // ģ�� �߰�
	}

	void friend(char ch) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� : ");
		String name = sc.next();
		System.out.println("��ȣ : ");
		String num = sc.next();

		switch (ch) {
		case 'A':
			System.out.println("���� : ");
			String major = sc.next();
			add(new School(name, num, major));
			break;

		case 'B':
			System.out.println("���� : ");
			String grade = sc.next();
			add(new Worker(name, num, grade));
			break;
		}
	}

	void all() {
		for (int i = 0; i < n; i++) {
			arr[i].show();
		}
	}
}

public class Day12_Java8 {
	public static void main(String[] args) {

		Arr arr = new Arr(5);
		
		while(true) {
			System.out.println("A. �б� ģ�� ����");
			System.out.println("B. ���� ���� ����");
			System.out.println("C. ����");
			System.out.println("D. ���");
			System.out.println(" ���� �Է� ");
			
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			switch (c) {
			case 'A' :
				arr.friend(c);
				break;
			case 'B' :
				arr.friend(c);
				break;
			case 'C' :
				System.out.println("����");
				return;	//���� ���� ������ ����
			case 'D' :
				arr.all();
				break;
			default :
				break;
			
			}
		}
		
		
		
		
	}
}
