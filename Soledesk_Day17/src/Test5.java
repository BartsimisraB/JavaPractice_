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

		// 버튼을 사용하는 방법 1번째(직접 인터페이스에 접근)
		JButton j1 = new JButton("버튼 1");
		c.add(j1);

		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				j1.setBackground(Color.red);
			}
		});

		// 버튼을 사용하는 방법 2번째(클래스로 인터페이스에 접근)
		JButton j2 = new JButton("버튼 2");
		c.add(j2);

		j2.addActionListener(new Mouse());

		// 버튼을 사용하는 방법 3번째(MouseListener 사용)
		JButton j3 = new JButton("버튼 3");
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
