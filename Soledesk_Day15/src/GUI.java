import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {
	// Graphic User Interface
	GUI() {
		super("Java"); // ���� ����
		setVisible(true); // ������ ��� �޼ҵ�

		JButton j1 = new JButton("��ư 1");
		JButton j2 = new JButton("��ư 2");
		JButton j3 = new JButton("��ư 3");
		Container c = getContentPane();
		// 1.�������� ��ӹ޾� ���� �Լ��� ������ ��ü�� ���� �� �ִ�.
		// 2.����Ʈ���� �˾Ƴ���.
		// 3.�� ���� ������Ʈ�� �����ϴµ�, ��ġ �����ڸ� ����� ��ġ�ؾ��Ѵ�.
		c.add(j1);
		c.add(j2);
		c.add(j3);

		c.setLayout(new FlowLayout());
		// ��ġ������ - > ������� ��ġ
		//Flow, Border, Card ��

	}

	public static void main(String[] args) {
		
		new GUI();

	}
}
