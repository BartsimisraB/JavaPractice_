import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main9 extends JFrame {

	Main9() {
		setTitle("���̾�α�");
		Container c = getContentPane();
		setVisible(true);

		c.add(new Dia(), BorderLayout.NORTH);
		// �г��� ������ ���ʿ� ��ġ

	}

	// �г� ������ Ŭ���� Dia
	class Dia extends JPanel {
		JButton j = new JButton("�̸� �Է�");
		JTextField j1 = new JTextField(10);

		JButton j2 = new JButton("Ȯ��");
		JButton j3 = new JButton("�޽���");

		Dia() {
			setBackground(Color.DARK_GRAY);
			add(j);
			add(j1);
			add(j2);
			add(j3);

			j.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("�̸� �Է�");
					if (name != null) {
						j1.setText(name);
					}
				}
			});
			
			j2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int r = JOptionPane.showConfirmDialog(null, "���?", "Ȯ��", JOptionPane.YES_NO_CANCEL_OPTION);
					if(r == JOptionPane.CLOSED_OPTION) {
						j1.setText("���� ���ߴ�");
					}
					else if(r == JOptionPane.YES_OPTION) {
						j1.setText("��");
					}
					else if(r == JOptionPane.NO_OPTION){
						j1.setText("�ƴϿ�");
					}
					else {
						j1.setText("���");
					}
				}
			});
			
			j3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "���", "�޼���", JOptionPane.WARNING_MESSAGE);
				}
				
			});

		}

	}

	public static void main(String[] args) {
		new Main9();
	}
}
