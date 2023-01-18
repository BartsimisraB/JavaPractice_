package JFrame_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame {
	Test() {

		Container c = getContentPane();
		setVisible(true);
		setSize(480, 360);

		JPanel j1 = new JPanel();
		JPanel j2 = new JPanel();
		JPanel j3 = new JPanel();

		j1.setBackground(Color.red);
		c.add(j1, BorderLayout.NORTH);

		j2.setLayout(new GridLayout(4, 4));
		c.add(j2);

		j3.setBackground(Color.yellow);
		c.add(j3, BorderLayout.SOUTH);

		JLabel jl = new JLabel("입력");
		JTextField jf = new JTextField(10);

		j1.add(jl);
		j1.add(jf);

		JLabel jl2 = new JLabel("결과");
		JTextField jf2 = new JTextField(10);

		j3.add(jl2);
		j3.add(jf2);

		for (int i = 0; i < 16; i++) {
			JButton jb = new JButton();
			String s[] = { "+", "-", "*", "/", "계산", "CE" };
			j2.add(jb);
			if(i < 10) {
				jb.setText(Integer.toString(i));
			}
			else {
				jb.setText(s[i-10]);
			}
			jb.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
//					if(i < 10) {
//						jf.setText((String) e.getSource());
//					}
				}
			});
		}
	}

	public static void main(String[] args) {
		new Test();
	}
}
