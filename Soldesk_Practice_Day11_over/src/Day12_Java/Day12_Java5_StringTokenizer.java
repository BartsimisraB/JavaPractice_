package Day12_Java;

import java.util.StringTokenizer;

public class Day12_Java5_StringTokenizer {

	public static void main(String[] args) {
		
		String str="id=123#name=gildong#addr=seoul";
		StringTokenizer s = new StringTokenizer(str,"#");
		
		int n = s.countTokens(); //#을 기준으로 나눠진 덩어리의 수
		System.out.println(n);
	
		while(s.hasMoreTokens()) {//뒤에 토큰이 남아있지 않을 때 까지
			String a =s.nextToken();
			System.out.println(a);
		}
	
	}
}
