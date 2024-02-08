package projectTest;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyWin5 extends JFrame implements ActionListener {
	JLabel lb1 = new JLabel("이름1:");
	JTextField tf1 = new JTextField(5);
	JButton bt1 = new JButton("버튼1");
	JLabel lb2 = new JLabel("이름2:");
	JTextField tf2 = new JTextField(5);
	JButton bt2 = new JButton("종료");
	JLabel lbst = new JLabel("메세지를 보여 줍니다."); // 레이블로

	public MyWin5() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout()); // 붙일때 일정간격으로 붙여주는 메소드
		con.add(lbst);
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);
		con.add(lb2);
		con.add(tf2);
		con.add(bt2);
		this.setTitle("자바 스윙");
		this.setSize(400, 300);
		this.setLocation(700, 400);
		this.setVisible(true);
		bt1.addActionListener(new ActionListener() { // 익명자식객체를 이용해서 바로 사용

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
				lbst.setText("버튼 1을 클릭했습니다");
			}
		});
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				confirmExit();
			}
		}); // 파일읽기 작업 처리
		JOptionPane.showMessageDialog(this, "파일을 읽었습니다!", "파일읽기", JOptionPane.INFORMATION_MESSAGE);

	}

	public void confirmExit() {
		int answer = JOptionPane.showConfirmDialog(this, "종료는 yes, 계속하려면 no", "윈도우를 종료하시겠습니까?",
				JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) { // 사용자가 yes를 눌렀을 경우
			System.out.println("프로그램을 종료합니다.");
			// 파일로 객체를 보내는 일을 처리

			System.exit(0);
		} else { // 사용자가 yes이외의 값을 눌렀을 경우
			System.out.println("종료를 취소합니다.");
			lbst.setText("종료를 취소합니다.");
		}
	}

	public static void main(String[] args) {
		new MyWin5(); // 익명객체
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}