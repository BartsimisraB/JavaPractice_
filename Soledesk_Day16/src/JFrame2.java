import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;

//class Mouse extends MouseAdapter {
//	public void mouseClicked(MouseEvent e) {
//		System.out.println("���콺 Ŭ��");
//	}
//}
//public class JFrame2 {
//	public static void main(String[] args) {
//		JFrame f = new JFrame();
//		
//		f.setLayout(new FlowLayout());
//		
//		JButton j1 = new JButton("one");
//		JButton j2 = new JButton("two");
//		
//		j1.addMouseListener(new Mouse());
//		j2.addMouseListener(new Mouse());
//		
//		f.add(j1);
//		f.add(j2);
//		f.setVisible(true);
//	}
//}
//�̺�Ʈ ������ : �̺�Ʈ�� ó���ϴ� �ڹ� ���α׷�
//
//�̺�Ʈ �����ʴ� �������̽��� �����ϸ�
//�����ڴ� �̺�Ʈ ������ �������̽��� ��ӹް� 
//�߻�޼ҵ带 �����ϸ� ��
//
//
//- MouseEvent  : ���콺 ����
//- ActionEvent : JButton, JMenuItem, JTextField
//- ItemEvenvt : JCheckBox, JRadioButton