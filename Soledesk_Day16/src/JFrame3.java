import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class My implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();	//�̺�Ʈ�� ��� �߻��߳�
		
		if(b.getText().equals("Ŭ��")) {	//�̺�Ʈ�� �߻��� ��ư���� �˾Ƴ�
			b.setText("click");
		}
		else
			b.setText("Ŭ��");
		
	}
}
public class JFrame3 extends JFrame {
	JFrame3 () {
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton b = new JButton("Ŭ��");
		
		b.addActionListener(new My());
		//Ŭ���� My�� ������Ѽ� ��ư�� Ŭ�� �������� �ƴҶ� �̺�Ʈ ����
		
		c.add(b);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFrame3();
	}
}
