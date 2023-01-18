import javax.swing.*;
import java.awt.*;

public class Main_3 extends JFrame {

	Main_3() {
		Color c[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE };

		Container ct = getContentPane();
		setVisible(true);
		ct.setLayout(new GridLayout(1, 5));

		JButton[] bt = new JButton[5];

		for (int i = 0; i < bt.length; ++i) {
			bt[i] = new JButton();
			bt[i].setBackground(c[i]);
			ct.add(bt[i]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {

		new Main_3();
	}
}
