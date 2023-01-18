package Day13_Java;

class Friend {

	private String name;

	private String phone;

	Friend(String name, String phone) {

		this.name = name;
		this.phone = phone;
	}

	String get() {

		return name + " " + phone;
	}
}

class ITFriend extends Friend {
	String computer;

	ITFriend(String name, String phone, String computer) {
		super(name, phone);
		this.computer = computer;
	}
	
	public void show() {
		System.out.println(computer+ " " + get());
	}
}

public class Main2 {
	public static void main(String[] args) {

//		실행 결과) 컴퓨터 홍길동 번호 010-111-1111 
		ITFriend it = new ITFriend("홍길동", "010-111-1111", "컴퓨터");

		it.show();
	}
}
