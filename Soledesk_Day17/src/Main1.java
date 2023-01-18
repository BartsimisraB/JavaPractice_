import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main1 {
	public static void main(String[] args) {

		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());

		JCheckBox b1 = new JCheckBox("비활성화");
		JCheckBox b2 = new JCheckBox("감추기");

		JButton b3 = new JButton("button");

		j.add(b1);
		j.add(b2);
		j.add(b3);

		b1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					b3.setEnabled(false);
				} else {
					b3.setEnabled(true);
				}
			}
		});
		b2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					b3.setVisible(false);
				} else {
					b3.setVisible(true);
				}
			}
		});
		j.setVisible(true);
	}
}
//체크박스 2개와 일반버튼 1개 만들어
//
//체크박스 하나는 "비활성화"로 이름을 주고
//
//체크박스 하나는 "감추기" 로 이름을 주고
//
//일반버튼 이름은 "button"이라고 한다.
//
//​
//
//비활성화 체크박스를 클릭하면 일반 버튼을 비활성화
//
//감추기 체크박스를 클릭하면 일반 버튼을 안보이게 출력해라.