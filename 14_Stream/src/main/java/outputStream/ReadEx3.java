package outputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx3 {

	public static void main(String[] args) {
		try(InputStream is = new FileInputStream("c:/temp/test3.db")){	
			byte [] buffer= new byte[5];
			
			int num= is.read(buffer,2,3);
			//인덱스 2번부터 3번째까지 버퍼에 저장한다.
			if(num !=-1) {				
				for(int i=0; i< buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
		}catch(IOException e) {
			
		}
	}
}
