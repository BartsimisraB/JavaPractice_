package Day12_Java;

import java.util.StringTokenizer;

public class Day12_Java5_StringTokenizer {

	public static void main(String[] args) {
		
		String str="id=123#name=gildong#addr=seoul";
		StringTokenizer s = new StringTokenizer(str,"#");
		
		int n = s.countTokens(); //#�� �������� ������ ����� ��
		System.out.println(n);
	
		while(s.hasMoreTokens()) {//�ڿ� ��ū�� �������� ���� �� ����
			String a =s.nextToken();
			System.out.println(a);
		}
	
	}
}
