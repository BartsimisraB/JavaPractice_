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

//		인원수를입력받아인원수를 Profile에 대한 객체배열개수로 설정한다. 
//		이름과 아이디도 입력받아 객체배열에 저장한 후 출력해라.

		Scanner sc = new Scanner(System.in);
		System.out.println("인원 수 입력");
		int num = sc.nextInt();
		
		Profile [] pf = new Profile [num];
		for(int i = 0; i < pf.length; i++) {
			System.out.println("이름 입력");
			String name = sc.next();
			System.out.println("id 입력");
			String id = sc.next();
			pf[i] = new Profile(name, id);
		}
		sc.close();
		
		for (int i = 0; i < pf.length; i++) {
			System.out.println(pf[i].getname() + " " + pf[i].getid());
		}
	}
}
