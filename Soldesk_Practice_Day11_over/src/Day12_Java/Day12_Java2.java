package Day12_Java;

public class Day12_Java2 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);//�� �ν��Ͻ� �ּ� ���� ������ ���
		System.out.println(str1.equals(str2));// �� �ν��Ͻ� ���ڿ� ���� ������ ���
		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		
		String str3 = "abc";
		String str4 = "abc";
		
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
}
