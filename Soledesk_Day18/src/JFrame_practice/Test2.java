package JFrame_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JFrame {

	JButton j = new JButton("Cal");
	JLabel j1 = new JLabel("��� ���");

	Test2() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		c.add(j1);
		setVisible(true);

		j.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Aa a = new Aa(); // ���̾�α�
				a.setVisible(true);
			}
		});
		
	}
	
	class Aa extends JDialog {
		JTextField jf1 = new JTextField(15);
		JTextField jf2 = new JTextField(15);

		JButton j2 = new JButton("ADD");

		Aa() {
			setLayout(new FlowLayout());
			add(new JLabel("�� ���� ���մϴ�"));
			add(jf1);
			add(jf2);
			add(j2);

			j2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false); // ���̾� �α� â ����
					// ���ڿ��� ����������
					int sum = Integer.parseInt(jf1.getText()) 
							+ Integer.parseInt(jf2.getText());
					// ������ ���ڿ���
					j1.setText(Integer.toString(sum));
				}
			});
		}
	}

	public static void main(String[] args) {
		new Test2();
	}

}
