package Test;

import java.util.ArrayList;
import java.util.Scanner;

class Who {
	private int id;
	private String name, dept, addr, birthday;

	Who() {
	}

	Who(int id, String name, String dept, String addr, String birthday) {
		this.name = name;
		this.id = id;
		this.addr = addr;
		this.birthday = birthday;
		this.dept = dept;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getaddr() {
		return addr;
	}

	public void setaddr(String addr) {
		this.addr = addr;
	}

	public String getbirthday() {
		return birthday;
	}

	public void setbirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getdept() {
		return dept;
	}

	public void setdept(String dept) {
		this.dept = dept;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

}

class Emp {
//	사번: 123
//    이름: 홍길동
//    부서: 개발부서
//    주소: 서울시 용산구
//    생일: 10/26
//   사원정보가 입력되었다. 
	Scanner sc = new Scanner(System.in);
	ArrayList<Who> a = new ArrayList<Who>();

	void in() {
		Who w = new Who();
		System.out.println("사번 :");
		w.setid(sc.nextInt());
		System.out.println("이름 :");
		w.setname(sc.next());
		System.out.println("부서 :");
		w.setdept(sc.next());
		sc.nextLine();
		System.out.println("주소 :");
		w.setaddr(sc.nextLine());
		System.out.println("생일 :");
		w.setbirthday(sc.next());

		a.add(w);
		System.out.println("사원 정보가 입력되었다.");

	}

	void out() {
		System.out.println("검색하고자 하는 사원의 번호는 ?");
		int id = sc.nextInt();
		if(a.size() == 0) {
			System.out.println("아직 등록된 사원이 없습니다.");
		}
		for (int i = 0; i < a.size(); i++) {
			if (id == a.get(i).getid()) {
				System.out.println("이름 : " + a.get(i).getname());
				System.out.println("부서 : " + a.get(i).getdept());
				System.out.println("주소 : " + a.get(i).getaddr());
				System.out.println("생일 : " + a.get(i).getbirthday());
			} else if (id != a.get(i).getid()) {
				System.out.println("해당하는 사원이 존재하지 않습니다.");
			}
		}
	}

	void end() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
}

public class Worker {
	public static void main(String[] args) {
		Emp e = new Emp();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 사원정보 입력\r\n" + "2. 사원정보 개별 조회\r\n" + "3. 프로그램 종료");

			int select = sc.nextInt();
			switch (select) {
			case 1:
				e.in();
				break;
			case 2:
				e.out();
				break;
			case 3:
				e.end();
				break;
			}
		}
	}
}
