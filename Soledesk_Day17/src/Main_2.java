import java.util.StringTokenizer;

public class Main_2 {
	public static void main(String[] args) {
		
//		���ڿ� ��1+2+3+4+5���� ��+���� �����ؼ� ���� 15�� ����ض�
//
//		(StringTokenizer,parseInt, trim() �� ���)
		
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
