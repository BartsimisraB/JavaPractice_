import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class My implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();	//이벤트가 어디서 발생했나
		
		if(b.getText().equals("클릭")) {	//이벤트가 발생한 버튼명을 알아냄
			b.setText("click");
		}
		else
			b.setText("클릭");
		
	}
}
public class JFrame3 extends JFrame {
	JFrame3 () {
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton b = new JButton("클릭");
		
		b.addActionListener(new My());
		//클래스 My와 연결시켜서 버튼을 클릭 했을떄와 아닐때 이벤트 설정
		
		c.add(b);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFrame3();
	}
}
