import java.awt.*;
import javax.swing.*;


public class Gui2 {
	public static void main(String[] args) {
		
		JFrame j =new JFrame("JFrame Àç¹Õ´Ù~");
		j.setLayout(new BorderLayout());
	
		j.add(new JButton("µ¿"), BorderLayout.EAST);
		j.add(new JButton("¼­"), BorderLayout.WEST);
		j.add(new JButton("³²"), BorderLayout.SOUTH);
		j.add(new JButton("ºÏ"), BorderLayout.NORTH);
		j.add(new JButton("Áß¾Ó"), BorderLayout.CENTER);
		j.setSize(500, 500);
		j.setVisible(true);
	
	
	
	}
}
