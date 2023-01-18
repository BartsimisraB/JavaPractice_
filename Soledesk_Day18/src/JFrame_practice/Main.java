package JFrame_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
	Main() {
		Container c = getContentPane();
		setVisible(true);

		JMenuBar j = new JMenuBar();
		JMenu j1 = new JMenu("File");
		JLabel jb = new JLabel();

		JMenuItem jm1 = new JMenuItem("Load");
		JMenuItem jm2 = new JMenuItem("Hide");
		JMenuItem jm3 = new JMenuItem("Exit");

		ImageIcon im = new ImageIcon("C://Users//11027//OneDrive//πŸ≈¡ »≠∏È/≈©∑’.jpg");
		setJMenuBar(j);

		c.add(jb);
		j.add(j1);
		
		j1.add(jm1);
		j1.add(jm2);
		j1.add(jm3);

		jm1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jb.setIcon(im);
			}
		});
		jm2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jb.setIcon(null);
			}
		});
		jm3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new Main();
	}
}
