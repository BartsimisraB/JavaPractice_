import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuBar1 extends JFrame {
	JMenuBar1() {
		Container c = getContentPane();
		setVisible(true);

		JMenuBar j = new JMenuBar(); // 1
		JMenu j1 = new JMenu("File");
		JMenu j2 = new JMenu("Edit");
		JMenu j3 = new JMenu("Source"); // 2

		JMenuItem j4 = new JMenuItem("New");
		JMenuItem j5 = new JMenuItem("Undo Typing"); // 3

		setJMenuBar(j); // 메뉴바 세팅

		j.add(j1);
		j.add(j2);
		j.add(j3);

		j1.add(j4); // j1.add(JMenuItem j4);
		j2.add(j5);

		j4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("new");
			}
		});
	}

	public static void main(String[] args) {

		new JMenuBar1();
	}
}
