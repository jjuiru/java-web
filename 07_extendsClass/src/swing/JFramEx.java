package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

	public class JFramEx extends JFrame {
		public JFramEx() {
			Container con = this.getContentPane();
			con.setLayout(null);
			
			JButton jb1 = new JButton("전체내용");
			jb1.setLocation(100, 550);
			jb1.setSize(100, 30);
			con.add(jb1);
			
			JButton jb13 = new JButton("입력");
			jb13.setLocation(230, 550);
			jb13.setSize(100, 30);
			con.add(jb13);
			
			JButton jb14 = new JButton("조회");
			jb14.setLocation(360, 550);
			jb14.setSize(100, 30);
			con.add(jb14);
			
			JButton jb15 = new JButton("수정");
			jb15.setLocation(490, 550);
			jb15.setSize(100, 30);
			con.add(jb15);
			
			JButton jb16 = new JButton("삭제");
			jb16.setLocation(620, 550);
			jb16.setSize(100, 30);
			con.add(jb16);
			//------
			
			
			JLabel jb2 = new JLabel("이름");
			con.add(jb2);
			jb2.setLocation(90, 50);
			jb2.setSize(50, 30);
			
			JLabel jb21 = new JLabel("아이디");
			con.add(jb21);
			jb21.setLocation(90, 100);
			jb21.setSize(50, 30);
			
			JLabel jb22 = new JLabel("패스워드");
			con.add(jb22);
			jb22.setLocation(290, 50);
			jb22.setSize(50, 30);
			
			JLabel jb23 = new JLabel("생년월일");
			con.add(jb23);
			jb23.setLocation(290, 100);
			jb23.setSize(50, 30);
			
			JLabel jb24 = new JLabel("전화번호");
			con.add(jb24);
			jb24.setLocation(520, 50);
			jb24.setSize(50, 30);
			
			JLabel jb25 = new JLabel("잔고");
			con.add(jb25);
			jb25.setLocation(540, 100);
			jb25.setSize(50, 30);
			
			//------
			
			JTextField jt1 = new JTextField();
			con.add(jt1);
			jt1.setLocation(140, 50);
			jt1.setSize(100, 30);
			
			JTextField jt12 = new JTextField();
			con.add(jt12);
			jt12.setLocation(140, 100);
			jt12.setSize(100, 30);
			
			JTextField jt13 = new JTextField();
			con.add(jt13);
			jt13.setLocation(360, 50);
			jt13.setSize(100, 30);
			
			JTextField jt14 = new JTextField();
			con.add(jt14);
			jt14.setLocation(360, 100);
			jt14.setSize(100, 30);
			
			JTextField jt15 = new JTextField();
			con.add(jt15);
			jt15.setLocation(580, 50);
			jt15.setSize(100, 30);
			
			JTextField jt16 = new JTextField();
			con.add(jt16);
			jt16.setLocation(580, 100);
			jt16.setSize(100, 30);
			//----
			this.setLocation(200, 100);
			this.setTitle("스윙 연습");
			this.setVisible(true);  // 윈도우 프레임을 보이게
			this.setSize(830, 800);  // 크기 설정
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public static void main(String... ar) {
			new JFramEx();
		}
		
		void button() {
			
		}

}
