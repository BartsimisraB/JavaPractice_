import java.util.Scanner;

public class BasicMath_1193 {
	public static void main(String[] args) {

		// 1/1 ||| 1/2 2/1 ||| 1/3 2/2| 3/1 ||| 1/4 2/3 3/2 4/1... ���ڴ� 1��, �и�� 1��
		// �и� 1�� �Ǹ� �ִ밪 ���� �� �ݺ�
		// �Է°� ���� + �и�, ������ �ִ밪 == ���� ����
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int range=0;
		int num = 0; // �и�, ������ �ִ밪
		int up = 1;
		int down =1;
		int max; // �ִ밪 ����
		if(a ==1) {
			System.out.println(1+"/"+1);
		}else {
		while (true) {
			for(int i=0; i<a;i++) {
				
			if(down==1) {
			num++;
			break;

			
			}

		}
			System.out.println(range);
		}
		
	}
}
}