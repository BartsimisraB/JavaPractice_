import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Check implements ItemListener {
	JRadioButton b1, b2, b3;

	Check(JRadioButton b1, JRadioButton b2, JRadioButton b3) {
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			// üũ�ڽ� ���� �� Ȱ��ȭ
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
		} else {// üũ�ڽ� �� ���� �� ��Ȱ��ȭ
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
		}
	}
}

public class Test3 {
	public static void main(String[] args) {

		JFrame j = new JFrame("This ������");
		j.setLayout(new GridLayout(0, 1));

		JCheckBox jc = new JCheckBox("���� ����");

		JRadioButton jb1 = new JRadioButton("Java");
		JRadioButton jb2 = new JRadioButton("Python");
		JRadioButton jb3 = new JRadioButton("C#");

		ButtonGroup g1 = new ButtonGroup();
		g1.add(jb1);
		g1.add(jb2);
		g1.add(jb3);

		//
		j.add(jc);
		j.add(jb1);
		j.add(jb2);
		j.add(jb3);

		// ���� ��ư ��Ȱ��ȭ
		jb1.setEnabled(false);
		jb2.setEnabled(false);
		jb3.setEnabled(false);

		// üũ�ڽ� ���ý�
		jc.addItemListener(new Check(jb1, jb2, jb3));

		// ���� ��ư �̺�Ʈ ó��
		jb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("Java!!");
				}
			}
		});
		jb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("Python!!");
				}
			}
		});
		jb3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("C# !!");
				}
			}
		});

		j.setVisible(true);
	}
}