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
//	���: 123
//    �̸�: ȫ�浿
//    �μ�: ���ߺμ�
//    �ּ�: ����� ��걸
//    ����: 10/26
//   ��������� �ԷµǾ���. 
	Scanner sc = new Scanner(System.in);
	ArrayList<Who> a = new ArrayList<Who>();

	void in() {
		Who w = new Who();
		System.out.println("��� :");
		w.setid(sc.nextInt());
		System.out.println("�̸� :");
		w.setname(sc.next());
		System.out.println("�μ� :");
		w.setdept(sc.next());
		sc.nextLine();
		System.out.println("�ּ� :");
		w.setaddr(sc.nextLine());
		System.out.println("���� :");
		w.setbirthday(sc.next());

		a.add(w);
		System.out.println("��� ������ �ԷµǾ���.");

	}

	void out() {
		System.out.println("�˻��ϰ��� �ϴ� ����� ��ȣ�� ?");
		int id = sc.nextInt();
		if(a.size() == 0) {
			System.out.println("���� ��ϵ� ����� �����ϴ�.");
		}
		for (int i = 0; i < a.size(); i++) {
			if (id == a.get(i).getid()) {
				System.out.println("�̸� : " + a.get(i).getname());
				System.out.println("�μ� : " + a.get(i).getdept());
				System.out.println("�ּ� : " + a.get(i).getaddr());
				System.out.println("���� : " + a.get(i).getbirthday());
			} else if (id != a.get(i).getid()) {
				System.out.println("�ش��ϴ� ����� �������� �ʽ��ϴ�.");
			}
		}
	}

	void end() {
		System.out.println("���α׷� ����");
		System.exit(0);
	}
}

public class Worker {
	public static void main(String[] args) {
		Emp e = new Emp();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. ������� �Է�\r\n" + "2. ������� ���� ��ȸ\r\n" + "3. ���α׷� ����");

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
