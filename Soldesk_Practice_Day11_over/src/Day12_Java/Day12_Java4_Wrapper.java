package Day12_Java;

public class Day12_Java4_Wrapper {
	public static void main(String[] args) {

		Integer i = new Integer(10); // boxing : �⺻���� ��ü������ ��ȯ
		// int i2 = i.intValue();
		// Integer i2 = 10; //autoboxing

		int i1 = i.intValue(); // unboxing : ��ü���� �⺻������ ��ȯ
		// int �� ��������
		// intValue() : Integer Ŭ���� ������ int �ڷ��� ���� ������ �� ���

		Integer number1 = Integer.valueOf("100");
		Integer number2 = Integer.valueOf(100);
		// valueOf() ���� �޼ҵ� : �����ڸ� ������� �ʰ� ������ ���ڿ��� �ٷ�
		// Ŭ���� ��ü�� ��ȯ ���� �� �ִ�.

		int num = Integer.parseInt("100");
		// parseInt() : ���ڿ��� � ���ڸ� ��Ÿ�� ��, �̸��׸�
		// �й��̳� ���� ���� ���ڿ��� ���޵� ��� ���ڿ����� int���� �ٷ� ����ͼ� ��ȯ
		// �Ű������� �׻� String��!!
		Character c = new Character('a');
		char c1 = c.charValue();

		Boolean b = new Boolean(true);
		boolean b1 = b.booleanValue();

		int i2 = Integer.parseInt("123");
		boolean b2 = Boolean.parseBoolean("true");
		double d2 = Double.parseDouble("3.14");
		System.out.println(b2);
		
		int i3 = Integer.valueOf(123);	//�����ڽ�
		int i4 = Integer.valueOf("10") + Integer.valueOf("20");

		System.out.println(i4);
		
		String s = Integer.toString(123);
		//������ ��ü 123�� ���ڿ��� ��ȯ
		System.out.println(s);
	
		Integer i11 = 100;	//auto boxing
		int n1 = i11 + 200;	//auto unboxing
		
		System.out.println(n1);
	
	
	
	}
}
