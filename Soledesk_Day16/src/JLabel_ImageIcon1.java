import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabel_ImageIcon1 extends JFrame{
	JLabel_ImageIcon1() {
		Container c = getContentPane();
		setVisible(true);
		c.setLayout(new FlowLayout());
		c.setSize(500,500);
		JLabel j = new JLabel("�ȳ��ϼ���");
		
		ImageIcon i = new ImageIcon("C://Users//11027//OneDrive//���� ȭ��/2.png");
		JLabel j1 = new JLabel(i);
		j1.setSize(10,2);
		JLabel j2 = new JLabel("ȭ�����̳׿�", SwingConstants.CENTER);
		
		c.add(j);
		c.add(j1);
		c.add(j2);
	}
	
	public static void main(String[] args) {
		new JLabel_ImageIcon1();
	}
}
