package outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) {	
		try(OutputStream os= new FileOutputStream("c:/temp/test1.db")) {
			// 추상클래스인 outputstream 의 객체를 자식 fileoutput으로 위치를 정해 내보낸다.
			byte a = 10; byte b=20; byte c=30;
			os.write(a); os.write(b); os.write(c);
			// 1 byte 씩 출력
			os.flush();		//출력 버퍼에 있는 모든 바이트출력	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
