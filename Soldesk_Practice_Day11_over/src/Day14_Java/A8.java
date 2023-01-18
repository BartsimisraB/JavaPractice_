package Day14_Java;

interface Person1 {

	String work();

}

class Worker implements Person1 {

	static void pr(Person1 p) {
		System.out.println(p.work());
	}

	@Override
	public String work() {
		return "일한다";
	}
}

class Student implements Person1 {
	static void pr(Person1 p) {
		System.out.println(p.work());
	}

	@Override
	public String work() {
		return "공부한다.";
	}

}

public class A8 {
	public static void main(String[] args) {
		
		Worker.pr(new Worker()); // 일한다
		Student.pr(new Student()); // 공부한다 출력
	}
}
