package Day11_Java1;
interface Addin{
	
	public int add(int a, int b);	//public abstract int add(int a, int b)�� ������ ������
	public int add(int a);	// �������̽������� ���� �����ϱ� ����
	
	default void pr(){	//�ڹ� 8�� �߰��� ����Ʈ �޼ҵ�
		System.out.println("���� ����");
	}
	// default��� ���� ���� ������ ���� �߻� �޼ҵ�� �ν�!!
}
class Add implements Addin{

	@Override
	public int add(int a, int b) {	//�������̽��� �߻�޼ҵ��� ������ �״�� ������ �������̵� �ؾ��Ѵ�.
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int add(int a) {	//�����ε� : �Լ����� ���� �� �Ű������� ������ ������ �ٸ��� �ϱ�.
		int sum = 0;
		for (int i = 0; i<= a; i++) {
			sum += i;
		}
		return sum;
	}
}
public class Day11_5_InterFace {
	public static void main(String[] args) {
			
		Add a = new Add();
		System.out.println(a.add(1, 4));
		System.out.println(a.add(10));
		a.pr();
	}
}
