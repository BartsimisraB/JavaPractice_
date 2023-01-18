import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main3 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setVisible(true);
		j.setLayout(new FlowLayout());
		
		JRadioButton jr1 = new JRadioButton("magenta");
		JRadioButton jr2 = new JRadioButton("red");
		
		j.add(jr1);
		jr1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					jr1.setBackground(Color.magenta);
				}
			}
		});
		j.add(jr2);
		jr2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					jr2.setBackground(Color.red);
				}
			}
		});
	}
}
//������ư �̸��� ��magenta��, ��red�� �ΰ��� �����ϰ�magenta�� 
//������ ��ư�� ���� magenta��, red�� ������ red������ �����ض�