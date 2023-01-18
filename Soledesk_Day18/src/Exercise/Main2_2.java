package Exercise;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main2_2 {
	public static void main(String[] args) {
//		 프레임에 임의의 정수(1~50)범위에서 수 하나를 띄우고, 
//		 버튼“+5”, “-5”, “/5”버튼을 만들어 +5를누르면 임의의 수에서 +5한값을띄우고,
//		 나머지버튼도 알맞은연산을 하도록 구현해라. 버튼은 단 한번밖에 못누른다.
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
