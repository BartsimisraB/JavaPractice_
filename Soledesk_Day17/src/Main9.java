import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main9 extends JFrame {

	Main9() {
		setTitle("다이어로그");
		Container c = getContentPane();
		setVisible(true);

		c.add(new Dia(), BorderLayout.NORTH);
		// 패널을 프레임 북쪽에 위치

	}

	// 패널 생성한 클래스 Dia
	class Dia extends JPanel {
		JButton j = new JButton("이름 입력");
		JTextField j1 = new JTextField(10);

		JButton j2 = new JButton("확인");
		JButton j3 = new JButton("메시지");

		Dia() {
			setBackground(Color.DARK_GRAY);
			add(j);
			add(j1);
			add(j2);
			add(j3);

			j.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름 입력");
					if (name != null) {
						j1.setText(name);
					}
				}
			});
			
			j2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int r = JOptionPane.showConfirmDialog(null, "계속?", "확인", JOptionPane.YES_NO_CANCEL_OPTION);
					if(r == JOptionPane.CLOSED_OPTION) {
						j1.setText("선택 안했다");
					}
					else if(r == JOptionPane.YES_OPTION) {
						j1.setText("네");
					}
					else if(r == JOptionPane.NO_OPTION){
						j1.setText("아니요");
					}
					else {
						j1.setText("취소");
					}
				}
			});
			
			j3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "경고", "메세지", JOptionPane.WARNING_MESSAGE);
				}
				
			});

		}

	}

	public static void main(String[] args) {
		new Main9();
	}
}
