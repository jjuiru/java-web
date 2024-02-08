package projectTest;

import java.awt.Container;

import javax.swing.JFrame;

public class MyWin1 extends JFrame {
	public MyWin1() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		this.setTitle("자바 스윙");
		this.setSize(400, 300);
		this.setLocation(700, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyWin1();
	}

}
