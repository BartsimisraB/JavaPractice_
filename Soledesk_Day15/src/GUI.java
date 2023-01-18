import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {
	// Graphic User Interface
	GUI() {
		super("Java"); // 제목 설정
		setVisible(true); // 프레임 출력 메소드

		JButton j1 = new JButton("버튼 1");
		JButton j2 = new JButton("버튼 2");
		JButton j3 = new JButton("버튼 3");
		Container c = getContentPane();
		// 1.프레임을 상속받아 메인 함수에 프레임 객체를 만들 수 있다.
		// 2.컨텐트팬을 알아낸다.
		// 3.그 위에 컴포넌트들 부착하는데, 배치 관리자를 사용해 배치해야한다.
		c.add(j1);
		c.add(j2);
		c.add(j3);

		c.setLayout(new FlowLayout());
		// 배치관리자 - > 순서대로 배치
		//Flow, Border, Card 등

	}

	public static void main(String[] args) {
		
		new GUI();

	}
}
