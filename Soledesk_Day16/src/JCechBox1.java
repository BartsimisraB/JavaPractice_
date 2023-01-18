import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.*;

public class JCechBox1 extends JFrame {

	JCechBox1() {
		Container c = getContentPane();
		setVisible(true);
		c.setLayout(new FlowLayout());

		JCheckBox j[] = new JCheckBox[15];

		c.setLayout(new GridLayout(3, 5));

		for (int i = 0; i < j.length; i++) {
			j[i] = new JCheckBox("체크" + (i + 1));
			c.add(j[i]);
		}

//		c.add(j);
//
//		j.addItemListener(new ItemListener() {
//
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				JCheckBox j = (JCheckBox) e.getSource();
//				if (e.getStateChange() == ItemEvent.SELECTED) {
//					System.out.println("자바 재밌당");
//				}
//			}
//		});

	}

	public static void main(String[] args) {

		new JCechBox1();
	}
}
