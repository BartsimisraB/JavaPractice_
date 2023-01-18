import java.util.StringTokenizer;

public class Main_2 {
	public static void main(String[] args) {
		
//		문자열 “1+2+3+4+5”를 “+”로 구분해서 총합 15를 출력해라
//
//		(StringTokenizer,parseInt, trim() 다 사용)
		
		String str = "1+2+3+4+5";
		
		StringTokenizer st = new StringTokenizer(str, "+");

		int sum = 0;
		
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			sum += Integer.parseInt(token.trim());
		}
		System.out.println(sum);
		
	}
}
