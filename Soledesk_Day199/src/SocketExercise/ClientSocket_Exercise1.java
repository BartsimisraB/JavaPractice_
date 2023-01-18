package SocketExercise;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientSocket_Exercise1 {
	public static void main(String[] args) {
		// 클라이언트
		
		Socket s = null;
		
		try {
			s = new Socket();
			System.out.println("연결중...");
			
			s.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결 성공 !");
			
			byte []b = null;
			String msg = null;
			
			OutputStream os = s.getOutputStream();
			
			//문자열을 바이트로 변경해서 전송
			msg = "Hi Server";
			b = msg.getBytes("UTF-8");
			
			os.write(b);
			System.out.println("데이터 보내기 성공");
			
			InputStream in = s.getInputStream();
			b = new byte[100];
			// 문자열을 바이트 배열로 변경
			int r = in.read();
			// 바이트 배열을 문자열로 변경해서 전송
			msg = new String(b, 0, r, "UTF-8");
			System.out.println("데이터 받기 성공!");
			
			os.close();
			s.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
