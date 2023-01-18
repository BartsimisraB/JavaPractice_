import java.util.HashMap;
import java.util.Scanner;

public class HashMap2 {
	public static void main(String[] args) {
		
		HashMap hs = new HashMap();
		
		hs.put("young", "123");
		hs.put("hyunseok", "456");
		hs.put("hanhee", "789");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id, pasword 입력");	//입력한 값과 해쉬맵을 비교하기
			String id = sc.next();
			String pw = sc.next();
			
			if(!hs.containsKey(id)) {	//id가 해시맵에 없을 경우 (contains~ 메소드는 해시에서 자주 사용)
				System.out.println("id가 존재하지 않습니다.");
				continue;
			}
			else	//id가 해시맵에 존재하는 경우
				if(!hs.get(id).equals(pw)) {	//해시맵에 id는 존재하지만 pw가 아닌 경우
					System.out.println("pw가 틀렸습니다.");
					continue;
				}
				else	//pw까지 일치하는 경우
					System.out.println("로그인");
				break;
		}
		
	}
}
