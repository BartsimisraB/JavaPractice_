package Day11_Java1;

interface AA {
	public void funcA();
}

interface BB {
	public void funcB();
}

interface C extends AA, BB { // ���߻�� �������̽����� �������̽� ��ӹޱ�
	public void funcC();
}

class D implements C {// AA, BB�� ��ӹ��� C�� �ҷ������Ƿ� ��� �޼ҵ� ��������

	@Override
	public void funcA() {
		System.out.println("funcA");
	}

	@Override
	public void funcB() {
		System.out.println("funcB");
	}

	@Override
	public void funcC() {
		System.out.println("funcC");

	}
}

public class Day11_6_InterFace4 {

	public static void main(String[] args) {

		D d1 = new D();
		d1.funcA();
		AA a1 = d1; // ��ĳ���� , d1�� a1���� ����ȯ�� �ؼ� funcA()�� ����
		a1.funcA();

		BB b1 = d1; // ��ĳ����
		b1.funcB();

		C c1 = d1; // ��ĳ����
		c1.funcA();
		c1.funcB();
		c1.funcC();

		// �������̽����� ��ü ���� �Ұ��ϱ� ������
		// ��ӹ��� Ŭ���� D���� ��ü ��������.
	}
}