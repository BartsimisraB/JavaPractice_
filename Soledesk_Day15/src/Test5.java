import java.util.Scanner;

class Profile {

	String name, id;

	Profile(String name, String id) {

		this.name = name;
		this.id = id;

	}

	String getname() {
		return name;
	}

	String getid() {
		return id;
	}

}

public class Test5 {
	public static void main(String[] args) {

//		�ο������Է¹޾��ο����� Profile�� ���� ��ü�迭������ �����Ѵ�. 
//		�̸��� ���̵� �Է¹޾� ��ü�迭�� ������ �� ����ض�.

		Scanner sc = new Scanner(System.in);
		System.out.println("�ο� �� �Է�");
		int num = sc.nextInt();
		
		Profile [] pf = new Profile [num];
		for(int i = 0; i < pf.length; i++) {
			System.out.println("�̸� �Է�");
			String name = sc.next();
			System.out.println("id �Է�");
			String id = sc.next();
			pf[i] = new Profile(name, id);
		}
		sc.close();
		
		for (int i = 0; i < pf.length; i++) {
			System.out.println(pf[i].getname() + " " + pf[i].getid());
		}
	}
}
