package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements ActionListener,MouseListener {
	// 액션리스너 이벤트를 발생시키는 인터페이스 상속
	JButton jb = new JButton("버튼1"); // 모든곳에서 인스턴스jb를 사용할 수 있도록 필드로 올린다.
	JButton jb2 = new JButton("버튼2");

	public MyFrame2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 메모리삭제
		Container con = this.getContentPane(); // 컴포넌트 붙이는곳(import 해야함)

		this.setVisible(true);// 윈도우 보이게하기
		this.setSize(500, 300);// 사이즈
		this.setLocation(300, 300);// 위치 좌표지정
		this.setTitle("오늘은 이벤트");// 타이틀
		
		
		con.addMouseListener(this);
		con.setLayout(new FlowLayout());// FlowLayout 은 계속 나열하여 붙여주는 레이아웃
		
		con.add(jb);// 컴포넌트에 버튼 인스턴스를 붙여준다.
		jb.addActionListener(this);//버튼 jb 인스턴스에 액션리스너에 이벤트를 더해준다.
		// 나자신을생성할때 this사용(MyFram2)
		
		con.add(jb2);
		jb2.addActionListener(this);
	}

	public static void main(String[] args) {
		new MyFrame2();
	}

	@Override
	public void actionPerformed(ActionEvent e) { //액션리스너 재정의
		if (e.getSource() == jb) {
			System.out.println("버튼1");
		} else if (e.getSource() == jb2) {
			System.out.println("버튼2");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX()+","+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
