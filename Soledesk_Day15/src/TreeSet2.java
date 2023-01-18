import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		
		TreeSet<Integer> it = new TreeSet<Integer>();
		
		it.add(30);
		it.add(100);
		it.add(50);
		
		Integer i = it.first();	// 맨 앞 출력
		System.out.println(i);
		
		i = it.last();	// 트리셋은 오름 차순 형태이므로 100 출력
		System.out.println(i);

		i = it.lower(80);	//80보다 작은 값
		System.out.println(i);
		
		i = it.higher(80);	//80보다 큰 값
		System.out.println(i);
	
	}
}
