package outputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx2 {

	public static void main(String[] args) {
		try(InputStream is = new FileInputStream("c:/temp/test3.db")){	
			byte [] buffer= new byte[5];
			
			while (true) {
				int cut =is.read(buffer);
				//버퍼에 값을 저장해서 갯수를 더해준다.
				if(cut==-1) {
					// 파일의 마지막이 -1이기 때문에 마지막에 갔을때 반복문을 빠져나간다.
					break;
				}				
				for(int i=0; i<cut; i++) {
					System.out.println(buffer[i]);
				}
				
//				for(byte by : buffer) {
//					if(by!=0)
//					System.out.println(data);
//				}
			}
		}catch(IOException e) {
			
		}
	}
}
