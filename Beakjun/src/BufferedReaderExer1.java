import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedReaderExer1 { // readLine(); 을 할 떄 마다
									// try-catch 문으로 감싸주거나
	public static void main(String[] args) throws IOException { // throws IOException을 통한 예외처리를 해도 된다.

		// Scanner sc = new Scanner(System.in)과 같이 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // br 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // bw 선언

		// StringTokenizer
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()); // 선언
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}

		bw.close();
	}
}
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
//String str = "abcdef"; // 출력할 문자열
//bw.write(s); // 출력
//bw.newLine(); // 줄바꿈
//bw.flush(); // 남아있는 데이터 모두 출력
//bw.close(); --