import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Mouse implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton j1 = (JButton) e.getSource();
		j1.setBackground(Color.red);
	}

}

public class Test5 extends JFrame {
	Test5() {
		Container c = getContentPane();
		setVisible(true);
		c.setLayout(new FlowLayout());

		// ��ư�� ����ϴ� ��� 1��°(���� �������̽��� ����)
		JButton j1 = new JButton("��ư 1");
		c.add(j1);

		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				j1.setBackground(Color.red);
			}
		});

		// ��ư�� ����ϴ� ��� 2��°(Ŭ������ �������̽��� ����)
		JButton j2 = new JButton("��ư 2");
		c.add(j2);

		j2.addActionListener(new Mouse());

		// ��ư�� ����ϴ� ��� 3��°(MouseListener ���)
		JButton j3 = new JButton("��ư 3");
		c.add(j3);

		j3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				j3.setBackground(Color.red);
			}
		});
	}

	public static void main(String[] args) {

		new Test5();
	}
}
