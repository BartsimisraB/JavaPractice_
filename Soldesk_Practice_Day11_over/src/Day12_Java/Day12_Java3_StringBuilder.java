package Day12_Java;

public class Day12_Java3_StringBuilder {
	public static void main(String[] args) {

		String javaStr = new String("java");
		System.out.println("javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));

		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));

		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun !!!");
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));

		javaStr = buffer.toString(); // String Ŭ������ ��ȯ
		System.out.println(javaStr);
		System.out.println("���� ������� javaStr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
	}
}
