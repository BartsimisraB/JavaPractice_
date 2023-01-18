package Day12_Java;

public class Day12_Java3_StringBuilder2 {
	public static void main(String[] args) {

		// StringBuffer
		// 문자의 개수에 따라 버퍼 크기를 자동으로 조절할 수 있다.
		// 문자열이 길거나 문자열 작업이 많은 경우

		StringBuffer sb = new StringBuffer("Java");
		sb.append(" is very good");
		// 맨 끝에 추가

		sb.insert(0, "A "); // A Java is very good
		// 0번 인덱스 위치에 "A "를 추가
		sb.replace(2, 6, "Html"); // A Html is very good
		// 2번부터 5번 인덱스 사이에 위치한 문자를 Html로 변경
		System.out.println(sb);
		// 연산 후 sb 출력
	}
}
