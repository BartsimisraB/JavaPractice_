package Day11_Java1;

interface Food {
	public String name();
}

class Pizza implements Food { // �������̵�
	@Override	//�ּ�ó�� ǥ���ϱ�
	public String name() {
		return "����";
	}
}

class Steak implements Food { // �������̵�
	@Override
	public String name() {
		return "������ũ";
	}
}

public class Day11_6_InterFace3 {
	static void pr(Food f) { // Food f = new Pizza(); ��ĳ����
		System.out.println(f.name());
	}

	public static void main(String[] args) {

		pr(new Pizza());//pr ���� f.name()���� �̸��� �����ϴµ� ���� Ŭ�������� ������ �����̱� ������ ���� ���
		pr(new Steak());
	}
}
