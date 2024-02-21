package outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx2 {

	public static void main(String[] args) {	
		try(OutputStream os= new FileOutputStream("c:/temp/test3.db")) {
			// 추상클래스인 outputstream 의 객체를 자식 fileoutput으로 위치를 정해 내보낸다.
			byte [] array= {10,20,30,40,50};
			os.write(array, 1,3); // 1인덱스부터 3인덱스까지 저장
			// 배열로 넘기면 메소드 오버라이딩을 통해 배열의 모든 바이트가 출력된다.
			os.flush();		//출력 버퍼에 있는 모든 바이트출력	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
