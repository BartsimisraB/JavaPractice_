import java.util.Scanner;

public class String_2941 {
	public static void main(String[] args) {
		
/*	문자열 배열을 만들어서 크로아티아 알파벳을 배열의 각 인덱스에 입력
 *  문자열을 입력 후  입력받은 문자열 안에 크로아티아 알파벳이 해당하는지 비교하는 방법 있나?
 */
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String arr[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String str = sc.next();
		
		for (int i = 0; i < arr.length; i++) {
			if(str.equalsIgnoreCase(arr[i])) {
				count++;
			}
		}System.out.println(count);
	}
}
