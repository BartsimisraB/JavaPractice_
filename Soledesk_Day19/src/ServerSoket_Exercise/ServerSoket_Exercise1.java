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
			//���� ���� ����
			ser = new ServerSocket();
			// ���� ���ϰ� ���� ������ ����� ip �ּ�
			ser.bind(new InetSocketAddress("localhost",5001));
			
			while(true) {
				System.out.println("���� �Ǳ⸦ ��ٸ�");
				// ���� ��û�� �����ϸ鼭 ���� ����
				Socket so = ser.accept();
				
				byte[] b = null;
				String msg = null;
				// �о� ���̱�
				InputStream in = so.getInputStream();
				b = new byte[100];
				int r = in.read(b);
				// ����Ʈ �迭�� ���ڿ��� �ٲ� �� �б�
				msg = new String(b, 0, r, "UFT-8");
				
				System.out.println("������ �ޱ� ����");
				// Ŭ���̾�Ʈ���� ������
				OutputStream os = so.getOutputStream();
				msg = "Hi Client";
				// ���ڿ��� ����Ʈ�� �����ؼ� ����
				b = msg.getBytes("UTF-8");
				
				os.write(b);
				System.out.println("������ ������ ����");
				
				in.close();
				os.close();
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
