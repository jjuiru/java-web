package chap10_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchFinalEx {

	public static void main(String[] args){
//		Class.forName("agagasg");		
		//--------------------		
		try {// 코드블럭
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {//e는 변수명
			System.out.println("클래스가 존재하지 않습니다."); //예외처리 코드를 작성해라
//			e1.printStackTrace();// 어떤 예외가 발생했는지 프린트해준다.
		} finally { //생략도 가능
			System.out.println("반드시 실행");
			System.exit(0);
		}
		
		
		try {
			Connection conn= DriverManager.getConnection(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
