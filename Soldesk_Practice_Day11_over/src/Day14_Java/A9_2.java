package Day14_Java;

import java.util.ArrayList;

class A {
	private ArrayList<String> stack = new ArrayList<String>();
	
	public void push(String data) {
		stack.add(data);
	}
//	
//	public String pop() {
//		int len = stack.size();
//		if(len == 0) {
//			
//		}
//	}
	
	
}
class St<T> {
	int n;
	Object[] st;

	St() {
		st = new Object[3];
		n = 0;
	}

	public void push(T item) {
		if (n == 3) // 스택이 다 차있다.
			return;

		st[n] = item;
		n++;
	}
	public T pop() {
		if(n == 0) //스택이 비어있어 꺼낼 수 없다.
			return null;
		
		n--;	//메인에서 push를 통해 n값 증가된 상태에서 n-- 시작
		return(T)st[n];	//T로 형변환
	}
}

public class A9_2 {
	public static void main(String[] args) {

		St<String> s = new St<String>();
		s.push("java");	//st[0]
		s.push("db");	//st[1]
		s.push("html");	//st[2]
		
		for(int i = 0; i < 3; i++) {
		System.out.println(s.pop());
		}
		
		St<Integer> s1 = new St<Integer>();	//Integer로 구체화 시켜 저장해서 출력
		s1.push(10);
		s1.push(20);
		s1.push(30);
	
		for(int i = 0; i < 3; i++) {
			System.out.println(s1.pop());
		}
	}
}
