import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test extends JFrame implements ActionListener {
	JButton b[] = new JButton[16];
	String button_str[] = { "7", "8", "9", "/", "4", "5", "6", "x", "1", "2", "3", "-", "0", "C", "=", "+" };
	private JFrame frame;
	private JTextField mainspace;

	String mod = "";
	double result;

	Test() {
		frame = new JFrame();
		frame.setTitle("Calculate");
		frame.setSize(285, 265);
		// 화면 가운데 띄우기
		frame.setLocationRelativeTo(null);
		// 사이즈 조절 불가능
		frame.setResizable(false);
		// 창을 닫으면 프로그램 종료
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 위치 관리자 사용 안함
		frame.setLayout(null);

		// 계산기 상단 화면 생성
		mainspace = new JTextField();
		mainspace.setHorizontalAlignment(JTextField.RIGHT);
		mainspace.setBounds(8, 11, 255, 25);
		mainspace.setBackground(Color.WHITE);
		mainspace.setEditable(false);
		frame.add(mainspace);

		// 버튼 위치 설정
		int a1 = 15;
		int a2 = 15;
		int a3 = 15;
		int a4 = 15;

		for (int i = 0; i < 16; i++) {

			b[i] = new JButton(button_str[i]);
			frame.getContentPane().add(b[i]);

			if (i < 4) {
				b[i].setBounds(a1, 45, 45, 30);
				a1 += 65;
			} else if (i >= 4 && i < 8) {
				b[i].setBounds(a2, 90, 45, 30);
				a2 += 65;
			} else if (i >= 8 && i < 12) {
				b[i].setBounds(a3, 140, 45, 30);
				a3 += 65;
			} else if (i >= 12 && i < 16) {
				b[i].setBounds(a4, 190, 45, 30);
				a4 += 65;
			}
			// 버튼 색상 설정
			if ((i + 1) % 4 == 0) {
				b[i].setBackground(Color.yellow);
			} else {
				b[i].setBackground(Color.gray);
			}
			// 버튼 클릭시
			b[i].addActionListener(this);
		}

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		// 버튼 입력 시

		if (button.equals("+") ^ button.equals("-") ^ button.equals("x") ^ button.equals("/")) {
			modCal(button);
		} else if (button.equals("=")) {
			resultCal();
		} else if (button.equals("C")) {
			clearAll();
		} else if (button.equals("0") ^ button.equals("1") ^ button.equals("2") ^ button.equals("3")
				^ button.equals("4") ^ button.equals("5") ^ button.equals("6") ^ button.equals("7") ^ button.equals("8")
				^ button.equals("9")) {
			numClick(button);
		}
	}

	// 숫자 클릭시
	public void numClick(String num) {
		String button_str = mainspace.getText();
		if (button_str.equals("0.0")) {
			mainspace.setText(num);
		} 
		else {
			mainspace.setText(button_str + num);
		}
	}
	// C 클릭시
	public void clearAll() {
		result = 0.0;
		mod = "";
		mainspace.setText("0.0");
	}
	// = 연산 클릭시
	public void resultCal() {
		double op = Double.parseDouble(mainspace.getText());
		switch (mod) {
		case "+":
			result += op;
			break;
		case "-":
			result -= op;
			break;
		case "x":
			result *= op;
			break;
		case "/":
			result /= op;
			break;
		}
		mainspace.setText(Double.toString(result));
		mod = "";
	}

	// 연산자 (+, -, x, /) 클릭시
	public void modCal(String mod) {
		this.mod = mod;
		result = Double.parseDouble(mainspace.getText());
		mainspace.setText("");
	}

	public static void main(String[] args) {
		new Test();

	}
}
