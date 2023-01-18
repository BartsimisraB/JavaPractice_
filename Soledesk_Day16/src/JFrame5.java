import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrame5 extends JFrame {
	JFrame5() {
		Container c = getContentPane();
		setVisible(true);

		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");

		c.add(j1);
		c.add(j2);
		c.setLayout(new FlowLayout());

		j1.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				System.out.println(e.getX() + " " + e.getY());
			}

			public void mouseMoved(MouseEvent e) {

			}
		});
	}

	public static void main(String[] args) {
		
		new JFrame5();
	}
}