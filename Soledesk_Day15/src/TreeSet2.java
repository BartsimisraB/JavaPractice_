import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		
		TreeSet<Integer> it = new TreeSet<Integer>();
		
		it.add(30);
		it.add(100);
		it.add(50);
		
		Integer i = it.first();	// �� �� ���
		System.out.println(i);
		
		i = it.last();	// Ʈ������ ���� ���� �����̹Ƿ� 100 ���
		System.out.println(i);

		i = it.lower(80);	//80���� ���� ��
		System.out.println(i);
		
		i = it.higher(80);	//80���� ū ��
		System.out.println(i);
	
	}
}
