package ServerSoket_Exercise;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSoket_Exercise1 {
	public static void main(String[] args) {
		
		ServerSocket ser = null;
		
		try {
			//서버 소켓 생성
			ser = new ServerSocket();
			// 서버 소켓과 서버 소켓이 연결될 ip 주소
			ser.bind(new InetSocketAddress("localhost",5001));
			
			while(true) {
				System.out.println("연결 되기를 기다림");
				// 연결 요청을 수락하면서 소켓 생성
				Socket so = ser.accept();
				
				byte[] b = null;
				String msg = null;
				// 읽어 들이기
				InputStream in = so.getInputStream();
				b = new byte[100];
				int r = in.read(b);
				// 바이트 배열을 문자열로 바꾼 뒤 읽기
				msg = new String(b, 0, r, "UFT-8");
				
				System.out.println("데이터 받기 성공");
				// 클라이언트에게 보내기
				OutputStream os = so.getOutputStream();
				msg = "Hi Client";
				// 문자열을 바이트로 변경해서 전송
				b = msg.getBytes("UTF-8");
				
				os.write(b);
				System.out.println("데이터 보내기 성공");
				
				in.close();
				os.close();
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
