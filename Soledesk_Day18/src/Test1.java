import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test1 extends JFrame{
	JRadioButton j1=new JRadioButton("Â¥Àå¸é");
	JRadioButton j2=new JRadioButton("ÅÁ¼öÀ°");
	
	Test1(){
		Container c=getContentPane();
		setVisible(true);
		c.setLayout(new FlowLayout());
		
		ButtonGroup b1=new ButtonGroup(); 
		
		b1.add(j1);
		b1.add(j2);
		
		c.add(j1);
		c.add(j2);
		
		A a=new A();
		j1.addItemListener(a);
		j2.addItemListener(a);
	}
	
	class A implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()!=ItemEvent.SELECTED) {
				return;
			}
			if(e.getItem()==j1) {
				System.out.println("Â¥Àå¸é");
			}
			else if(e.getItem()==j2) {
				getContentPane().setBackground(Color.pink);
			}
		}		
	}
	public static void main(String[] args) {
		
		new Test1();
		
	}
}
