import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Person {
	private String name;
	private int id;

	Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	String getname() {
		return name;
	}

	int getid() {
		return id;
	}

	public boolean equals(Object obj) {
		Person p = (Person) obj;

		if (p.getid() == this.id && p.getname().equals(this.name)) {
			return true;
		} else
			return false;

	}
}

class Game {

	Scanner sc = new Scanner(System.in);

	ArrayList<Person> a = new ArrayList<Person>(5);

	Game() { // �ʱ�ȭ
		a.add(new Person("�ǿ�", 123)); // [0]
		a.add(new Person("����", 456)); // [1]
		a.add(new Person("����", 789)); // [2]
		a.add(new Person("����", 112)); // [3]
	}

	void in() {
		while (true) {
			System.out.println("�̸�, id �Է�");
			String name = sc.next();

			if (name.equals("stop")) {
				break;
			}

			int id = sc.nextInt();
			Person pp = new Person(name, id);

			if (a.contains(pp)) { // ����Ʈ a�� pp��� ��ü�� �ִٸ�
				System.out.println("���� �Է��� " + pp.getname() + "�� �����մϴ�.");
			} else {
				a.add(pp);
			}
		}
	} // in() �޼ҵ�� �Է°��� ArrayList<Person>�� ����ֱ�

	void out() {
		while (true) {
			Random r = new Random(); // MathŬ������ �ִ� Random�� �ƴ� RandomŬ���� ���
			int n = r.nextInt(a.size()); // 0 ~ 4 ���� �߻����� n�� ����

			Person p = a.get(n); // Person�� ��ü �ε��� ��ȣ == n
			String str = p.getname();

			System.out.println(str + " �� id��?"); // �ǿ��� id��?
			int id = p.getid(); // 123

			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			if (i == -1) { // -1 �Է� �� ����
				break;
			}
			if (i == id) {
				System.out.println("����!");
			} else {
				System.out.println("����!");
			}

		}
	}

	void end() { // ���α׷� ���� ����
		System.out.println("����");
		System.exit(0);

	}

}

public class A3 {
	public static void main(String[] args) {

		Game g = new Game();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1, 2, 3");
			// 1. �Է�(in)
			// 2. out
			// 3. end
			int select = sc.nextInt();
			switch (select) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;
			}
		}
	}
}