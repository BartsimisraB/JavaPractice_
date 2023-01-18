import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main8 extends JFrame {
	Main8() {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		j.setVisible(true);
		
		JLabel jb1 = new JLabel("ID: ");
		JTextField jt1 = new JTextField(20);
		
		JLabel jb2 = new JLabel("PW: ");
		JTextField jt2 = new JTextField(20);

		j.add(jb1);
		j.add(jt1);
		
		jt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = jt1.getText();
				System.out.println(str);
			}
		});
		j.add(jb2);
		j.add(jt2);
		
		jt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = jt2.getText();
				System.out.println(str);
			}
		});

	}

	public static void main(String[] args) {

		new Main8();
	}
}
