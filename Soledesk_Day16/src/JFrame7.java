import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AA extends MouseAdapter {
	public void mouseEntered(MouseEvent e) {
		JLabel j = (JLabel) e.getSource();
		j.setText("재밌어");
	}

	public void mouseExited(MouseEvent e) {
		JLabel j = (JLabel) e.getSource();
		j.setText("자바는");

	}
}

public class JFrame7 extends JFrame {

	JFrame7() {
		Container c = getContentPane();
		setVisible(true);

		JLabel j = new JLabel("자바는");
		c.setLayout(new FlowLayout());
		c.add(j);

		j.addMouseListener(new AA());
	}
}
