package Day12_Java;
//전화번호 관리 프로그램 : 학교사람, 직장동료 분류해서 저장

import java.util.Scanner;

class PhoneNum { // 부모 클래스
	String name;
	String phone;

	public PhoneNum(String n, String p) {
		name = n;
		phone = p;
	}

	void show() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);
	}
}

class School extends PhoneNum { // 학교 친구
	String major;

	School(String n, String p, String major) {
		super(n, p);
		this.major = major;
	}

	void show() { // overriding
		super.show();
		System.out.println("전공 : " + major);
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
		System.out.println("직급 : " + grade);
	}
}

class Arr {

	PhoneNum[] arr; // 객체 배열
	int n;

	Arr(int n) {
		arr = new PhoneNum[n]; // 배열 생성
		n = 0;
	}

	void add(PhoneNum p) {
		arr[n++] = p; // 친구 추가
	}

	void friend(char ch) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("번호 : ");
		String num = sc.next();

		switch (ch) {
		case 'A':
			System.out.println("전공 : ");
			String major = sc.next();
			add(new School(name, num, major));
			break;

		case 'B':
			System.out.println("직급 : ");
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
			System.out.println("A. 학교 친구 정보");
			System.out.println("B. 직장 동료 정보");
			System.out.println("C. 종료");
			System.out.println("D. 출력");
			System.out.println(" 문자 입력 ");
			
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
				System.out.println("종료");
				return;	//리턴 값이 없으면 종료
			case 'D' :
				arr.all();
				break;
			default :
				break;
			
			}
		}
		
		
		
		
	}
}
