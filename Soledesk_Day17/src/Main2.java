import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Motion extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		JButton b = (JButton) e.getSource();

		if (b.getText().equals("ok")) {
			System.out.println("확인");
		}
		else if (b.getText().equals("cancel")) {
			b.setEnabled(false);
		}
	}
}

public class Main2 extends JFrame {
	Main2() {
		Container c = getContentPane();
		setVisible(true);

		c.setBackground(Color.red);
		c.setLayout(new FlowLayout());

		JButton ok = new JButton("ok");
		JButton cancel = new JButton("cancel");

		c.add(ok);
		ok.addMouseListener(new Motion());

		c.add(cancel);
		cancel.addMouseListener(new Motion());

	}

	public static void main(String[] args) {

		new Main2();
	}
}
//1. 컨텐트팬의 배경색을 빨간색으로 하고, Ok
//, Cancel 버튼을부착한 frame하나 만들어라
//Ok버튼을 누르면 “확인”, Cancel을 누르면 버튼을 비활성화 시켜라. 
//(MouseAdapter로 접근)