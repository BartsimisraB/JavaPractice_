package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Th extends Thread {
	JLabel j;

	public Th(JLabel j) {
		this.j = j;
	}

	public void run() {
		try {
			for (int i = 0;; i++) {
				j.setText(Integer.toString(i));
				sleep(1000);
			}
		} catch (Exception e) {
			return;
		}
	}
}

public class Main extends JFrame {

	Main() {

		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		JLabel j = new JLabel();

		c.add(j);

		Th t = new Th(j); // �����尴ü����

		setVisible(true);

		t.start(); // ���������
	}

	public static void main(String[] args) {

		new Main();
	}
}