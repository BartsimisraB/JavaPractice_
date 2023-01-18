package SocketExercise;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientSocket_Exercise1 {
	public static void main(String[] args) {
		// Ŭ���̾�Ʈ
		
		Socket s = null;
		
		try {
			s = new Socket();
			System.out.println("������...");
			
			s.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("���� ���� !");
			
			byte []b = null;
			String msg = null;
			
			OutputStream os = s.getOutputStream();
			
			//���ڿ��� ����Ʈ�� �����ؼ� ����
			msg = "Hi Server";
			b = msg.getBytes("UTF-8");
			
			os.write(b);
			System.out.println("������ ������ ����");
			
			InputStream in = s.getInputStream();
			b = new byte[100];
			// ���ڿ��� ����Ʈ �迭�� ����
			int r = in.read();
			// ����Ʈ �迭�� ���ڿ��� �����ؼ� ����
			msg = new String(b, 0, r, "UTF-8");
			System.out.println("������ �ޱ� ����!");
			
			os.close();
			s.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
