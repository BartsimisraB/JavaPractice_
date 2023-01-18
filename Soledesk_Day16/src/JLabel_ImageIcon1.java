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
		JLabel j = new JLabel("안녕하세여");
		
		ImageIcon i = new ImageIcon("C://Users//11027//OneDrive//바탕 화면/2.png");
		JLabel j1 = new JLabel(i);
		j1.setSize(10,2);
		JLabel j2 = new JLabel("화요일이네요", SwingConstants.CENTER);
		
		c.add(j);
		c.add(j1);
		c.add(j2);
	}
	
	public static void main(String[] args) {
		new JLabel_ImageIcon1();
	}
}
