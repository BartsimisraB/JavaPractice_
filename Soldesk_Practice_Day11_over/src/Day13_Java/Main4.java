package Day13_Java;

public class Main4 {
	public static void main(String[] args) {
//		4. �Ǽ� 9.5�� ��üȭ(�ڽ�) ���Ѷ�.
//

		Double dNum = new Double(9.5);
//		4.1) ��üȭ ��Ų 9.5�� ���ڿ��� �����ض�.
//

		String dNum1 = dNum.toString();
//		4.2) ���ڿ��� ������ 9.5�� �⺻�������� ��ڽ��ض�.
//
		Double dNum2 = Double.valueOf(dNum1);
	}
}
