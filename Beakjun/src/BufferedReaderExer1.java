import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedReaderExer1 { // readLine(); �� �� �� ����
									// try-catch ������ �����ְų�
	public static void main(String[] args) throws IOException { // throws IOException�� ���� ����ó���� �ص� �ȴ�.

		// Scanner sc = new Scanner(System.in)�� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // br ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // bw ����

		// StringTokenizer
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()); // ����
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}

		bw.close();
	}
}
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // ����
//String str = "abcdef"; // ����� ���ڿ�
//bw.write(s); // ���
//bw.newLine(); // �ٹٲ�
//bw.flush(); // �����ִ� ������ ��� ���
//bw.close(); --