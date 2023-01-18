import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.ScrollPaneConstants;

public class Exer1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField idtextField;
	private JPasswordField passwordField;
	Newuser newuser;
	private JTextField txtTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exer1 frame = new Exer1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exer1() {
		setTitle("\uB85C\uADF8\uC778 \uD398\uC774\uC9C0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1212, 754);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(155, 196, 223));
		panel.setBounds(0, 0, 1099, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
				JButton btnNewButton = new JButton("확인");
				btnNewButton.setBounds(785, 10, 77, 21);
				panel.add(btnNewButton);
				btnNewButton.setFont(new Font("굴림", Font.PLAIN, 10));
				
						JButton btnNewButton_1 = new JButton("회원가입");
						btnNewButton_1.setBounds(874, 10, 83, 21);
						panel.add(btnNewButton_1);
						btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 10));
						
								idtextField = new JTextField();
								idtextField.setBounds(425, 12, 176, 30);
								panel.add(idtextField);
								idtextField.setFont(new Font("굴림", Font.PLAIN, 20));
								idtextField.setHorizontalAlignment(SwingConstants.LEFT);
								idtextField.setColumns(10);
								
										JLabel idJlabel = new JLabel("I D");
										idJlabel.setBounds(363, 10, 146, 35);
										panel.add(idJlabel);
										idJlabel.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
										
												passwordField = new JPasswordField();
												passwordField.setBounds(146, 13, 193, 31);
												panel.add(passwordField);
												
														JLabel pwJlabel = new JLabel("P W");
														pwJlabel.setBounds(87, 10, 106, 35);
														panel.add(pwJlabel);
														pwJlabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
						btnNewButton_1.addActionListener(this);
		
		txtTitle = new JTextField();
		txtTitle.setFont(new Font("굴림", Font.PLAIN, 27));
		txtTitle.setText("TITLE");
		txtTitle.setBounds(184, 60, 705, 116);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);

	}

	// 회원가입 버튼 입력 시 회원가입 창 띄우기
	@Override
	public void actionPerformed(ActionEvent e) {
		if (newuser == null) {
			newuser = new Newuser();
			newuser.setVisible(true);
		} else {
			newuser = new Newuser();
			newuser.dispose();
		}
	}
}
