import javax.swing.*;
import java.awt.*;

public class JFrame1 extends JFrame {

	JFrame1() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));

		for (int i = 0; i < 10; i++) {
//			String str = String.valueOf(i);
			String str = Integer.toString(i);
			JButton j = new JButton(str);
			c.add(j);
		}

		setVisible(true);
		c.setBackground(Color.cyan);
	}

	public static void main(String[] args) {

		new JFrame1();
	}
}