package Day12_Java;

public class Day12_Java3_StringBuilder2 {
	public static void main(String[] args) {

		// StringBuffer
		// ������ ������ ���� ���� ũ�⸦ �ڵ����� ������ �� �ִ�.
		// ���ڿ��� ��ų� ���ڿ� �۾��� ���� ���

		StringBuffer sb = new StringBuffer("Java");
		sb.append(" is very good");
		// �� ���� �߰�

		sb.insert(0, "A "); // A Java is very good
		// 0�� �ε��� ��ġ�� "A "�� �߰�
		sb.replace(2, 6, "Html"); // A Html is very good
		// 2������ 5�� �ε��� ���̿� ��ġ�� ���ڸ� Html�� ����
		System.out.println(sb);
		// ���� �� sb ���
	}
}
