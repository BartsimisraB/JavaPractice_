import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Text implements ActionListener {
	JTextArea ja;
	Text(JTextArea ja) {
		this.ja = ja;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton j = (JButton)e.getSource();
		ja.setText("");
		ja.append("�����Է�");
	}
	
}
public class Test6 extends JFrame {
	Test6() {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		JTextArea jt = new JTextArea(10, 20);
		jt.append("���� �Է�");
		
		j.add(jt);
		
		JButton b = new JButton("���� ��ư");
		j.add(b);
		
		b.addActionListener(new Text(jt));
		j.setVisible(true);
	}

	public static void main(String[] args) {
	new Test6()	;
	
	}
}
