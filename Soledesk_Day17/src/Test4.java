import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test4 extends JFrame {
	JTextField j = new JTextField(20);
	// 20 ���� �ؽ�Ʈ ��
	JTextArea j1 = new JTextArea(10, 20);
	// 10 , 20 �� �࿭ �ؽ�Ʈ

	Test4() {
		Container c = getContentPane();
		setVisible(true);
		c.setLayout(new FlowLayout());

		JLabel jl = new JLabel("enterŰ �Է�");
		c.add(jl);
		c.add(j);
		c.add(new JScrollPane(j1));

		j.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField) e.getSource();
				j1.append(jt.getText());
				j1.append("\n");
				// �ؽ�Ʈ �ʵ忡 ���� �ԷµǸ� �ؽ�Ʈ area�� �߰��ϰڴ�.
				jt.setText(" ");
				// �ؽ�Ʈ �ʵ带 �������� �ʱ�ȭ
			}
		});
	}
	public static void main(String[] args) {

		new Test4();
	}
}
