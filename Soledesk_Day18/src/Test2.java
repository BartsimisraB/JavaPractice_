import java.awt.*;
import javax.swing.*;

public class Test2 extends JFrame {
	Test2() {
		setTitle("������");
		setVisible(true);
		setSize(500, 500);	//������ ũ��
		
		Container c = getContentPane();
		c.setLayout(null);	//����Ʈ���� ���� x
		
		JLabel j = new JLabel("����");
		j.setLocation(130,50);	//���� ��¹� ��ǥ ����
		j.setSize(200,20);	//�����͵� ũ��
		c.add(j);
		
		
		
	}

	public static void main(String[] args) {
		new Test2();
	}
}