import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Mouse extends MouseAdapter {
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��!");
	}
	
	public void mouseDragged(MouseEvent e) {
		System.out.println("���콺 �巹��");
	}
}

public class GUI3 {
	public static void main(String[] args) {

		JFrame j = new JFrame("JFrame");
		j.setLayout(new FlowLayout());
		j.setSize(500, 500);

		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		
		j1.addMouseListener(new Mouse());
		j2.addMouseListener(new Mouse());
		//��ư�� ���콺�� Ŭ������ ��
		
		
		
		j.add(j1);
		j.add(j2);
		j.setVisible(true);
		
		
		
		
	}

}

/*
 * void mouseClicked(MouseEvent e) 
 * Invoked when the mouse button has been clicked (pressed and released) on a component. 
 * 
 * void mouseDragged(MouseEvent e) 
 * Invoked when a mouse button is pressed on a component and then dragged.
 * 
 * void mouseEntered(MouseEvent e) 
 * Invoked when the mouse enters a component.
 * 
 * void mouseExited(MouseEvent e) 
 * Invoked when the mouse exits a component.
 */
