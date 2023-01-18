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
		return "���Ѵ�";
	}
}

class Student implements Person1 {
	static void pr(Person1 p) {
		System.out.println(p.work());
	}

	@Override
	public String work() {
		return "�����Ѵ�.";
	}

}

public class A8 {
	public static void main(String[] args) {
		
		Worker.pr(new Worker()); // ���Ѵ�
		Student.pr(new Student()); // �����Ѵ� ���
	}
}
