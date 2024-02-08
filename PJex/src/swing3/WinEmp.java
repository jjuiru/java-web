package swing3;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BoxLayout;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;

class MyAction implements ActionListener { // 액션리스너 인터페이스를 상속받았다.

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());// 버튼대한 정보를 찍어줌
	}
}

public class WinEmp extends JFrame {

	JTextField tf1 = new JTextField(5);
	JTextField tf2 = new JTextField(5);
	JTextField tf3 = new JTextField(5);
	JTextField tf4 = new JTextField(5);
	JTextField tf5 = new JTextField(5);
	JTextField tf6 = new JTextField(5);
	JTextField tf7 = new JTextField(5);
	JTextField tf8 = new JTextField(5);

	JButton bt0 = new JButton("*사용메뉴얼");
	JButton bt1 = new JButton("자료출력"); // 이벤트 처리를 위해 필드로 설정
	JButton bt2 = new JButton("자료입력");
	JButton bt3 = new JButton("자료번호검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");
	JTextArea ta = new JTextArea(25, 70); // 텍스트 입출력공간
	Connection conn; // 필드화
	Statement stmt; // 필드화

	public WinEmp() {

		long time3 = System.currentTimeMillis(); // 성능 평가시 활용
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel lb0 = new JLabel("**단축키**");
		JLabel lb01 =new JLabel("Ctrl+i: 사용메뉴얼");
		JLabel lb02 =new JLabel(" Esc: 종료");

		JLabel lb1 = new JLabel("자료번호:");
		JLabel lb2 = new JLabel("이름:");
		JLabel lb3 = new JLabel("직무:");
		JLabel lb4 = new JLabel("상급자번호:");
		JLabel lb5 = new JLabel("입사일자:");
		JLabel lb6 = new JLabel("급여:");
		JLabel lb7 = new JLabel("인센티브:");
		JLabel lb8 = new JLabel("부서번호:");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 메모리삭제
	
		JFrame frame = new JFrame("KeyBinding Example");

		Container con = this.getContentPane(); // 컴포넌트 붙이는곳(import 해야함)

		con.setLayout(new BorderLayout());
		// 컨테이너 레이아웃에 보더 추가(동서남북 위치 지정가능)
		JPanel jp1 = new JPanel(new FlowLayout());
		// 판넬을 소환해서 배열해주는 플로어 레이아웃을 붙인다.

		jp1.add(bt0);
		jp1.add(bt1);
		jp1.add(bt2);
		jp1.add(bt3);
		jp1.add(bt4);
		jp1.add(bt5);
		

		con.add(jp1, BorderLayout.SOUTH); // 판넬에 붙인 버튼들을 보더레이아웃을 통해 아래쪽으로 배치함

		JScrollPane scroll = new JScrollPane(ta); // 텍스트 공간을 스크롤판에 붙인다.

		JPanel jp2 = new JPanel(new FlowLayout());

		con.add(jp2, BorderLayout.CENTER); // 판넬에 붙인 버튼들을 보더레이아웃을 통해 아래쪽으로 배치함
		jp2.add(scroll);

		JPanel jp3 = new JPanel(new FlowLayout());
		con.add(jp3, BorderLayout.NORTH);
		jp3.add(lb1);
		jp3.add(tf1);
		jp3.add(lb2);
		jp3.add(tf2);
		jp3.add(lb3);
		jp3.add(tf3);
		jp3.add(lb4);
		jp3.add(tf4);
		jp3.add(lb5);
		jp3.add(tf5);
		jp3.add(lb6);
		jp3.add(tf6);
		jp3.add(lb7);
		jp3.add(tf7);
		jp3.add(lb8);
		jp3.add(tf8);

		this.setLocation(500, 400);
		this.setSize(1000, 600);
		this.setVisible(true);// 윈도우 보이게하기
		this.setTitle("EMP관리");// 타이틀
		// ------------
		// KeyBinding 설정
		int condition = JComponent.WHEN_IN_FOCUSED_WINDOW;
		InputMap inputMap = ((JComponent) con).getInputMap(condition);
		ActionMap actionMap = ((JComponent) con).getActionMap();
		// ctrl+i 키에 대한 KeyStroke 생성
		KeyStroke ctrlIKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK);
		// KeyStroke과 Action을 연결
		inputMap.put(ctrlIKeyStroke, "doManual");
		actionMap.put("doManual", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				manual(); // ctrl+i 키를 눌렀을 때 manual 메소드 호출
			}
		});

		// ----------------------------
		bt0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				select();
			}
		});
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insert();
				clearTextField();
				select();
			}
		});
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				select2();
			}
		});
		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				update();

			}
		});
		bt5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				delete();
				select();
				ta.append("해당 자료가 정상적으로 삭제되었습니다.");
			}
		});

	}

	public void manual() {
		ta.append(
				"**EMP관리 시스템 메뉴얼**\n[자료출력] 현재 EMP table에 있는 자료를 출력합니다.\n[자료입력방법] 새로운 자료를 입력합니다.\n **입력방법**\n 자료번호-4자리숫자\n 이름-텍스트\n 직무-텍스트\n"
						+ "상급자번호-4자리숫자\n*입사일자-yyyymmdd(년월일8자리숫자)\n급여-숫자\n인센티브-숫자\n부서번호-2자리숫자\n\n[자료번호검색] 자료번호로 데이터를 조회합니다.\n 검색한 자료를 수정하여 저장합니다."
						+ "(입사일은 수정불가)\n[삭제] 검색한 자료를 삭제합니다.");
	}

	public void update() {
		ta.setText("");
		String updateSelect = "update emp set ename = '" + tf2.getText() + "', job = '" + tf3.getText() + "', mgr ="
				+ tf4.getText() + ", sal =" + tf6.getText() + ",comm =" + tf7.getText() + ",deptno=" + tf8.getText()
				+ " where empno = " + tf1.getText();
		try {
			int rs = stmt.executeUpdate(updateSelect);
			String str = String.format("[자료번호:" + tf1.getText() + "\t| 이름:" + tf2.getText() + "\t| 직무:" + tf3.getText()
					+ "    | 상급자번호:" + tf4.getText() + "   | 입사일자:" + tf5.getText() + "  | 급여:" + tf6.getText()
					+ "  | 인센티브:" + tf7.getText() + "   | 부서번호:" + tf8.getText() + "|]\n");
			ta.append(str + "\n 정상적으로 수정되었습니다.");

			if (rs == 1) {
				System.out.println("수정 성공!");
			} else {
				ta.append("정확한 정보를 입력해주세요.");
				System.out.println("수정 실패: 데이터가 없거나 문제가 발생했습니다.");
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류: " + e.getMessage());
//			e.printStackTrace();
		}
	}

	public void delete() {
		ta.setText("");
		String updateDelete = "delete from emp where empno=" + tf1.getText();
		try {
			int rs = stmt.executeUpdate(updateDelete);

			if (rs == 1) {
				System.out.println("삭제 성공!");
			} else {
				ta.append("정확한 정보를 입력해주세요.");
				System.out.println("수정 실패: 데이터가 없거나 문제가 발생했습니다.");
			}

		} catch (SQLException e) {
			System.out.println("SQL 오류: " + e.getMessage());
//		e.printStackTrace();
		}
	}

	private void clearTextField() {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		tf7.setText("");
		tf8.setText("");
	}

	public void select2() {
		ta.setText("");
		ResultSet rs;
		String sql = "select * from emp where empno=" + tf1.getText();
		try {
			rs = stmt.executeQuery(sql);
			ta.setText("");
			if (rs.next()) {
				tf1.setText(String.valueOf(rs.getInt("empno")));
				tf2.setText(rs.getString("ename"));
				tf3.setText(rs.getString("job"));
				tf4.setText(String.valueOf(rs.getInt("mgr")));
				tf5.setText(rs.getString("hiredate"));
				tf6.setText(String.valueOf(rs.getDouble("sal")));
				tf7.setText(String.valueOf(rs.getDouble("comm")));
				tf8.setText(String.valueOf(rs.getInt("deptno")));
				String str = String.format("[자료번호:" + rs.getInt("empno") + "\t| 이름:" + rs.getString("ename") + "\t| 직무:"
						+ rs.getString("job") + "    | 상급자번호:" + rs.getInt("mgr") + "   | 입사일자:"
						+ rs.getString("hiredate") + "  | 급여:" + rs.getDouble("sal") + "  | 인센티브:"
						+ rs.getDouble("comm") + "   | 부서번호:" + rs.getInt("deptno") + "|]\n");

				ta.append(str);
			} else {
				ta.append("정확한 정보를 입력해주세요.");
				System.out.println("정확하게 입력해 주세요.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void select() {
		String sql = "select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp";
		ResultSet rs;
		try {
			rs = stmt.executeQuery(sql);
			ta.setText("");
			while (rs.next()) {
				String str = String.format("[자료번호:" + rs.getInt("empno") + "\t| 이름:" + rs.getString("ename") + "\t| 직무:"
						+ rs.getString("job") + "    | 상급자번호:" + rs.getInt("mgr") + "   | 입사일자:"
						+ rs.getString("hiredate") + "  | 급여:" + rs.getDouble("sal") + "  | 인센티브:"
						+ rs.getDouble("comm") + "   | 부서번호:" + rs.getInt("deptno") + "|]\n");

				ta.append(str);
				ta.append("");
			}
		} catch (SQLException e) {
//			e.printStackTrace();
		}
	}

	public void insert() {
		String sql = String.format("insert into emp(empno, ename, job, mgr ,hiredate, sal, comm,deptno)values" + "("
				+ tf1.getText() + ",'" + tf2.getText() + "','" + tf3.getText() + "'," + tf4.getText() + ",'"
				+ tf5.getText() + "'," + tf6.getText() + "," + tf7.getText() + "," + tf8.getText() + ")");

		try {
			int res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("설마 너니???");
		}
	}

	public static void main(String[] args) {
		new WinEmp();

	}

}
