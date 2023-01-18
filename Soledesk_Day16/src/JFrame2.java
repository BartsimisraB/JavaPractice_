import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;

//class Mouse extends MouseAdapter {
//	public void mouseClicked(MouseEvent e) {
//		System.out.println("마우스 클릭");
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
//이벤트 리스너 : 이벤트를 처리하는 자바 프로그램
//
//이벤트 리스너는 인터페이스를 제공하며
//개발자는 이벤트 리스너 인터페이스를 상속받고 
//추상메소드를 구현하면 됨
//
//
//- MouseEvent  : 마우스 동작
//- ActionEvent : JButton, JMenuItem, JTextField
//- ItemEvenvt : JCheckBox, JRadioButton