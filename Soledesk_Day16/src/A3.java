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

	Game() { // 초기화
		a.add(new Person("건용", 123)); // [0]
		a.add(new Person("형민", 456)); // [1]
		a.add(new Person("요한", 789)); // [2]
		a.add(new Person("현석", 112)); // [3]
	}

	void in() {
		while (true) {
			System.out.println("이름, id 입력");
			String name = sc.next();

			if (name.equals("stop")) {
				break;
			}

			int id = sc.nextInt();
			Person pp = new Person(name, id);

			if (a.contains(pp)) { // 리스트 a에 pp라는 객체가 있다면
				System.out.println("지금 입력한 " + pp.getname() + "은 존재합니다.");
			} else {
				a.add(pp);
			}
		}
	} // in() 메소드로 입력값을 ArrayList<Person>에 집어넣기

	void out() {
		while (true) {
			Random r = new Random(); // Math클래스에 있는 Random이 아닌 Random클래스 사용
			int n = r.nextInt(a.size()); // 0 ~ 4 난수 발생시켜 n에 저장

			Person p = a.get(n); // Person의 객체 인덱스 번호 == n
			String str = p.getname();

			System.out.println(str + " 의 id는?"); // 건용의 id는?
			int id = p.getid(); // 123

			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			if (i == -1) { // -1 입력 시 종료
				break;
			}
			if (i == id) {
				System.out.println("정답!");
			} else {
				System.out.println("오답!");
			}

		}
	}

	void end() { // 프로그램 강제 종료
		System.out.println("종료");
		System.exit(0);

	}

}

public class A3 {
	public static void main(String[] args) {

		Game g = new Game();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1, 2, 3");
			// 1. 입력(in)
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