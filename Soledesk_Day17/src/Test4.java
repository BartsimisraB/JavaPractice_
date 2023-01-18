import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test4 extends JFrame {
	JTextField j = new JTextField(20);
	// 20 열의 텍스트 바
	JTextArea j1 = new JTextArea(10, 20);
	// 10 , 20 의 행열 텍스트

	Test4() {
		Container c = getContentPane();
		setVisible(true);
		c.setLayout(new FlowLayout());

		JLabel jl = new JLabel("enter키 입력");
		c.add(jl);
		c.add(j);
		c.add(new JScrollPane(j1));

		j.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField) e.getSource();
				j1.append(jt.getText());
				j1.append("\n");
				// 텍스트 필드에 값이 입력되면 텍스트 area에 추가하겠다.
				jt.setText(" ");
				// 텍스트 필드를 공백으로 초기화
			}
		});
	}
	public static void main(String[] args) {

		new Test4();
	}
}
