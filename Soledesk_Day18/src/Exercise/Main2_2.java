package Exercise;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main2_2 {
	public static void main(String[] args) {
//		 �����ӿ� ������ ����(1~50)�������� �� �ϳ��� ����, 
//		 ��ư��+5��, ��-5��, ��/5����ư�� ����� +5�������� ������ ������ +5�Ѱ�������,
//		 ��������ư�� �˸��������� �ϵ��� �����ض�. ��ư�� �� �ѹ��ۿ� ��������.
		int rand = (int) ((Math.random() * 50) + 1);
		JFrame j = new JFrame();
		j.setVisible(true);
		j.setLayout(new FlowLayout());
		
		JLabel jb = new JLabel(Integer.toString(rand));
		j.add(jb);

		JButton b1 = new JButton("add 5");
		JButton b2 = new JButton("sub 5");
		JButton b3 = new JButton("div 5");

		j.add(b1);
		j.add(b2);
		j.add(b3);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double sum  = rand + 5;
				jb.setText(Double.toString(sum));
				b1.setEnabled(false);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jb.setText(Double.parseDouble(jb.getText()) - 5 + "");
				b2.setEnabled(false);
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jb.setText(Double.parseDouble(jb.getText()) / 5 + "");
				b3.setEnabled(false);
			}
		});
	}
}
