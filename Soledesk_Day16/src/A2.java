import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A2 extends JFrame {

	A2() {
		Container c = getContentPane();
		setVisible(true);

		c.setBackground(Color.blue);

		JButton b1 = new JButton("ok");
		JButton b2 = new JButton("cancle");
		JButton b3 = new JButton("get");
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.setLayout(new FlowLayout());

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b1 = (JButton) e.getSource();
				c.setBackground(Color.orange);
			}
		});

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b2 = (JButton) e.getSource();
				b2.setEnabled(false);
			}
		});
		b3.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println(e.getX() + " " + e.getY());
			}

			@Override
			public void mouseMoved(MouseEvent e) {
			}

		});

	}

	public static void main(String[] args) {
		new A2();
	}

}
