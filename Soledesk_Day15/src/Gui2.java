import java.awt.*;
import javax.swing.*;


public class Gui2 {
	public static void main(String[] args) {
		
		JFrame j =new JFrame("JFrame ��մ�~");
		j.setLayout(new BorderLayout());
	
		j.add(new JButton("��"), BorderLayout.EAST);
		j.add(new JButton("��"), BorderLayout.WEST);
		j.add(new JButton("��"), BorderLayout.SOUTH);
		j.add(new JButton("��"), BorderLayout.NORTH);
		j.add(new JButton("�߾�"), BorderLayout.CENTER);
		j.setSize(500, 500);
		j.setVisible(true);
	
	
	
	}
}
