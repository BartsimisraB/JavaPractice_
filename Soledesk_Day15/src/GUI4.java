import javax.swing.*;
import java.awt.*;

public class GUI4 extends JFrame {

	GUI4() {

		Container c = getContentPane();
		JLabel j = new JLabel("ÀÚ¹Ù");

		c.setLayout(new FlowLayout());
		c.add(j);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		
		new GUI4();
	}
}
