import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrame4 extends JFrame {
	JFrame4() {

		Container c = getContentPane();
		setVisible(true);

		c.setLayout(new FlowLayout());

		JButton b1 = new JButton("ok");
		JButton b2 = new JButton("camcle");

		c.add(b1);
		c.add(b2);

		b1.addActionListener(new ActionListener() {
			// �͸� �Լ�
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok");
			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				b2.setEnabled(false);
				// Ȱ�� ��Ȱ��
			}
		});
	}

	public static void main(String[] args) {

		new JFrame4();
	}
}
