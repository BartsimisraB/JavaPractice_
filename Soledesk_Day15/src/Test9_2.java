import java.util.HashSet;

class Student {
	String a, b;

	Student(String a, String b) {
		this.a = a;
		this.b = b;
	}

	public int hashCode() {
		return Integer.parseInt(a);
	}

	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			
			Student student = (Student) obj;
			
			if (this.a == student.a) {
				return true;
			} else
				return false;
		}
		return false;

	}

	public String toString() {
		return a + " : " + b;
	}

}

public class Test9_2 {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "ȫ�浿"));
		set.add(new Student("200", "������"));
		set.add(new Student("300", "�̼���"));
		set.add(new Student("400", "�����"));
		set.add(new Student("100", "���߱�"));

		System.out.println(set);

	}
}
