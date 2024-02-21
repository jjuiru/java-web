package outputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx {

	public static void main(String[] args) {
		try(InputStream is = new FileInputStream("c:/temp/test1.db")){	
			while (true) {
				int data =is.read();
				if(data==-1) {
					// 파일의 마지막이 -1이기 때문에 마지막에 갔을때 반복문을 빠져나간다.
					break;
				}
				System.out.println(data);
			}
		}catch(IOException e) {
			
		}
	}
}
