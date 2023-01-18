import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

class Mouse extends MouseAdapter implements MouseMotionListener {

	
	@Override
	public void mouseDragged(MouseEvent e) {
		Container c = (Container)e.getSource();
		c.setBackground(Color.green);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Container c = (Container)e.getSource();
		c.setBackground(Color.pink);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseMoved(e);
	}
	
	
}



public class JFrame6 extends JFrame {

	JFrame6() {
		Container c = getContentPane();
		setVisible(true);

		c.setBackground(Color.pink);
		
		c.addMouseListener(new Mouse());
		c.addMouseMotionListener(new Mouse());
		
		
	}

	public static void main(String[] args) {
		new JFrame6();
	}
}
