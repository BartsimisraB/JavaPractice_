import java.awt.*;
import javax.swing.*;

public class Test2 extends JFrame {
	Test2() {
		setTitle("프레임");
		setVisible(true);
		setSize(500, 500); // 프레임 크기

		Container c = getContentPane();
		c.setLayout(null); // 컨텐트팬의 배치관리자 삭제

		JLabel j = new JLabel("하이");
		j.setLocation(130, 50); // 라벨의 출력문 좌표 설정
		j.setSize(200, 20); // 컴포넌트 크기
		c.add(j);

	}

	public static void main(String[] args) {
		new Test2();
	}
}