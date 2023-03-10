import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

public class Payment extends JFrame {
   
   private JPanel contentPane;
   
   private JLabel payListNameLabel[];   //주문목록 상품명 라벨
   private JTextField payPriceTextField[]; //주문목록 상품 가격
   private JTextField payTotalPrice;

   
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JLabel lblNewLabel_2;
   private JTextField textField_3;
   private JTextField textField_4;
   private JTextField textField_5;
   private JPanel panel;
   private final JPanel panel_1 = new JPanel();

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Payment frame = new Payment();
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
   public Payment() {
      
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);;
      setBounds(100, 100, 676, 660);
      setResizable(false);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      //주문/배송지 입력 패널
      JPanel orderPanel = new JPanel();
      orderPanel.setBackground(new Color(255, 255, 255));
      orderPanel.setBounds(0, 57, 340, 377);
      contentPane.add(orderPanel);
      orderPanel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("주문/배송 정보");
      lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(12, 10, 121, 23);
      orderPanel.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("주문자");
      lblNewLabel_1.setBounds(12, 68, 57, 15);
      orderPanel.add(lblNewLabel_1);
      
      textField = new JTextField();
      textField.setText("이름");
      textField.setBounds(12, 106, 116, 21);
      orderPanel.add(textField);
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setText("전화번호");
      textField_1.setBounds(153, 106, 158, 21);
      orderPanel.add(textField_1);
      textField_1.setColumns(10);
      
      textField_2 = new JTextField();
      textField_2.setText("이메일");
      textField_2.setBounds(12, 149, 219, 21);
      orderPanel.add(textField_2);
      textField_2.setColumns(10);
      
      lblNewLabel_2 = new JLabel("배송지 정보");
      lblNewLabel_2.setBounds(12, 211, 116, 15);
      orderPanel.add(lblNewLabel_2);
      
      textField_3 = new JTextField();
      textField_3.setText("이름");
      textField_3.setColumns(10);
      textField_3.setBounds(12, 249, 116, 21);
      orderPanel.add(textField_3);
      
      textField_4 = new JTextField();
      textField_4.setText("전화번호");
      textField_4.setColumns(10);
      textField_4.setBounds(153, 249, 158, 21);
      orderPanel.add(textField_4);
      
      textField_5 = new JTextField();
      textField_5.setText("주소");
      textField_5.setColumns(10);
      textField_5.setBounds(12, 292, 219, 21);
      orderPanel.add(textField_5);
      //

      

   
      
      
      //장바구니에서 체크표시된 결제품목의 개수 
      int payCount = 5;
      int addHeight = 31;
      //결제금액의 총 합
      int paySum=0;
      
      //결제품목 이름
      String payListName[]= { "상품이름1", "상품이름2", "상품이름3", "상품이름4", "상품이름5" };
      //상품들의 가격
      int payPrices[]= { 10000, 20000, 30000, 40000, 50000 };
      
      
      //결제리스트 패널
      JPanel payList=new JPanel();     
      payList.setBorder(null);
      payList.setBounds(346, 0, 280, 150);
      payList.setBackground(new Color(255, 255, 255));
      contentPane.add(payList);
      payList.setLayout(null);
      
      
      for(int i=0;i<payCount;i++) {
         //상품명
         payListNameLabel = new JLabel[payCount];                     //체크박스에 체크표시된 품목만큼의 라벨생성
         payListNameLabel[i] = new JLabel(payListName[i]);  //상품명 라벨에 넣기
         payListNameLabel[i].setFont(new Font("한컴 말랑말랑 Bold", Font.PLAIN, 12));  //상품명 폰트 
         payListNameLabel[i].setBounds(8, addHeight , 100, 23);           //위치 사이즈 
         //상품명 패널에 부착
         payList.add(payListNameLabel[i]);
         
         //상품가격
         int payPrice =  payPrices[i];        //상품가격을 차례대로 넣음
         payPriceTextField = new JTextField [payCount];  //가격텍스트필드 몇개인지!
         payPriceTextField[i] = new JTextField(Integer.toString(payPrice));  //문자열로 가격 입력함
         payPriceTextField[i].setHorizontalAlignment(SwingConstants.RIGHT);  // 글씨 오른쪽 정렬
         payPriceTextField[i].setBounds(210, addHeight, 100, 23);
         //가격 패널에 부착
         payList.add(payPriceTextField[i]);
         
         addHeight+=35;            //위에서부터 위치 떨어지는 정도를 추가
      }
                        
            
            // 총 금액 표시 텍스트필드 == new JTextField(여기에 금액들의 합 입력)
            for(int payPrice : payPrices) {
               paySum += payPrice;
            }
            
            
            // 결제버튼
            JButton paymentBtn = new JButton("\uACB0\uC81C\uD558\uAE30");
            paymentBtn.setFont(new Font("한컴 말랑말랑 Bold", Font.PLAIN, 12));
            paymentBtn.setBounds(12, 528, 97, 23);
            contentPane.add(paymentBtn);
            paymentBtn.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  // TODO Auto-generated method stub

               }

            });

            // 취소버튼
            JButton cancleBtn = new JButton("\uCDE8 \uC18C");
            cancleBtn.setFont(new Font("한컴 말랑말랑 Bold", Font.PLAIN, 12));
            cancleBtn.setBounds(126, 528, 97, 23);
            contentPane.add(cancleBtn);
            cancleBtn.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  // TODO Auto-generated method stub

                  // 프레임 종료
                  dispose();
               }

            });

            //스크롤팬
            payList.setPreferredSize(new Dimension(340, 150));
            JScrollPane payScrollPane = new JScrollPane(payList);
            payScrollPane.setBounds(342, 0, 359, 150);
            contentPane.add(payScrollPane);
            panel_1.setBounds(342, 0, 320, 235);
            panel_1.setBackground(new Color(255, 255, 255));
            contentPane.add(panel_1);
            panel_1.setLayout(null);
            
                        JLabel totalPriceLabel = new JLabel("\uCD1D \uAE08\uC561");
                        totalPriceLabel.setBounds(19, 192, 151, 22);
                        panel_1.add(totalPriceLabel);
                        totalPriceLabel.setFont(new Font("한컴 말랑말랑 Bold", Font.PLAIN, 12));
                        payTotalPrice = new JTextField();
                        payTotalPrice.setBounds(145, 192, 175, 22);
                        panel_1.add(payTotalPrice);
                        payTotalPrice.setText(Integer.toString(paySum));
                        payTotalPrice.setHorizontalAlignment(SwingConstants.RIGHT);
                        payTotalPrice.setFont(new Font("              Bold", Font.PLAIN, 18));
                        payTotalPrice.setColumns(10);
            
            
            

            
         
         }
}