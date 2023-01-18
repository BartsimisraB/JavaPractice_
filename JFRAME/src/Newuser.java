import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Newuser extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the frame.
	 */
	public Newuser() {
		setBounds(100, 100, 604, 789);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(182, 135, 239, 37);
		contentPane.add(passwordField);

		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBackground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(42, 482, 96, 37);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(42, 338, 96, 37);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_2_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(42, 204, 143, 37);
		contentPane.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("\uC774\uB984");
		lblNewLabel_2_3.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(42, 273, 96, 37);
		contentPane.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_4 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uC785\uB825");
		lblNewLabel_2_4.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(42, 133, 190, 37);
		contentPane.add(lblNewLabel_2_4);

		JLabel lblNewLabel_2_5 = new JLabel("\uC774\uC774\uB514 \uC785\uB825");
		lblNewLabel_2_5.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_5.setBounds(42, 61, 120, 37);
		contentPane.add(lblNewLabel_2_5);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(182, 204, 239, 37);
		contentPane.add(passwordField_1);

		textField = new JTextField();
		textField.setBounds(182, 63, 239, 37);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2_3_1 = new JLabel("\uD578\uB4DC\uD3F0 \uBC88\uD638");
		lblNewLabel_2_3_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_3_1.setBounds(42, 411, 120, 37);
		contentPane.add(lblNewLabel_2_3_1);

		JLabel lblNewLabel_2_3_2 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_2_3_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_3_2.setBounds(42, 552, 96, 37);
		contentPane.add(lblNewLabel_2_3_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(182, 273, 239, 37);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(182, 338, 239, 37);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(182, 411, 239, 37);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(182, 482, 239, 37);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(182, 552, 239, 37);
		contentPane.add(textField_5);

		JButton confirmBtn = new JButton("완료");
		confirmBtn.setFont(new Font("굴림", Font.PLAIN, 20));
		confirmBtn.setBounds(99, 643, 133, 52);
		contentPane.add(confirmBtn);
		confirmBtn.addActionListener(new ActionListener() {
			//완료 버튼 클릭시 이벤트 처리
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
				dispose();
			}
		});
		
		JButton cancleBtn = new JButton("취소");
		cancleBtn.setFont(new Font("굴림", Font.PLAIN, 20));
		cancleBtn.setBounds(344, 643, 133, 52);
		contentPane.add(cancleBtn);
		cancleBtn.addActionListener(new ActionListener() {
			//취소 버튼 클릭시 이벤트 처리
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
