import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AA extends MouseAdapter {
	public void mouseEntered(MouseEvent e) {
		JLabel j = (JLabel) e.getSource();
		j.setText("��վ�");
	}

	public void mouseExited(MouseEvent e) {
		JLabel j = (JLabel) e.getSource();
		j.setText("�ڹٴ�");

	}
}

public class JFrame7 extends JFrame {

	JFrame7() {
		Container c = getContentPane();
		setVisible(true);

		JLabel j = new JLabel("�ڹٴ�");
		c.setLayout(new FlowLayout());
		c.add(j);

		j.addMouseListener(new AA());
	}
}
