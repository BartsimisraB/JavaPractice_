import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test7 extends JFrame {

	String s[] = { "≈©∑’", "ª«∑Œ∑Œ" };

	ImageIcon[] im = { new ImageIcon("C://Users//11027//OneDrive//πŸ≈¡ »≠∏È/≈©∑’.jpg"),
			new ImageIcon("C://Users//11027//OneDrive//πŸ≈¡ »≠∏È/ª«∑Œ∑Œ.jpg") };

	JLabel j = new JLabel(im[0]);

	Test7() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		setVisible(true);

		JComboBox com = new JComboBox(s);
		c.add(j);
		c.add(com);

		com.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox c = (JComboBox) e.getSource();
				int i = c.getSelectedIndex();
				// ƒﬁ∫∏ π⁄Ω∫¿« º±≈√µ» æ∆¿Ã≈€ ¿Œµ¶Ω∫ æÀæ∆≥ª±‚
				j.setIcon(im[i]);

			}

		});
	}

	public static void main(String[] args) {
		new Test7();
	}
}
