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
			System.out.println("id, pasword �Է�");	//�Է��� ���� �ؽ����� ���ϱ�
			String id = sc.next();
			String pw = sc.next();
			
			if(!hs.containsKey(id)) {	//id�� �ؽøʿ� ���� ��� (contains~ �޼ҵ�� �ؽÿ��� ���� ���)
				System.out.println("id�� �������� �ʽ��ϴ�.");
				continue;
			}
			else	//id�� �ؽøʿ� �����ϴ� ���
				if(!hs.get(id).equals(pw)) {	//�ؽøʿ� id�� ���������� pw�� �ƴ� ���
					System.out.println("pw�� Ʋ�Ƚ��ϴ�.");
					continue;
				}
				else	//pw���� ��ġ�ϴ� ���
					System.out.println("�α���");
				break;
		}
		
	}
}
