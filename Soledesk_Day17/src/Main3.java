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
//라디오버튼 이름을 “magenta”, ”red” 두개로 설정하고magenta를 
//누르면 버튼의 색을 magenta로, red를 누르면 red색으로 변경해라