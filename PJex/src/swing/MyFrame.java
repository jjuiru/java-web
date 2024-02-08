package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyAction implements ActionListener{ //액션리스너 인터페이스를 상속받았다.

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());// 버튼대한 정보를 찍어줌		
	}
}

public class MyFrame extends JFrame{
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //메모리삭제
		Container con =this.getContentPane(); //컴포넌트 붙이는곳(import 해야함)
		
		this.setVisible(true);//윈도우 보이게하기
		this.setSize(500,300);//사이즈
		this.setLocation(300, 300);//위치 좌표지정
		this.setTitle("오늘은 이벤트");// 타이틀
		
		con.setLayout(new FlowLayout());//FlowLayout 은 계속 나열하여 붙여주는 레이아웃
		JButton jb=new JButton("버튼1");
		con.add(jb);
		jb.addActionListener(new MyAction());//액션리스너에 이벤트를 더해준다.
		JButton jb2=new JButton("버튼2");
		con.add(jb2);
		jb2.addActionListener(new MyAction());
	}

	public static void main(String[] args) {
		new MyFrame();

	}

}
