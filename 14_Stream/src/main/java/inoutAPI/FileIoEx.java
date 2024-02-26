package inoutAPI;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileIoEx {

	public static void main(String[] args) {
		File dir2 = new File("c:/temp/images");
		dir2.mkdirs();
		
		File dir= new File("C:/temp");
		//파일을 열고 객체 생성
		File[] list = dir.listFiles();
		//파일 데이터를 목록으로 저장
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		for(File file : list) {
			
			System.out.print(sdf.format(new Date(file.lastModified()))+"\t");
			// C:/temp안에있는 파일의 정보를 출력
			
			if(file.isDirectory()) {
				System.out.print("<DIR>\t");
			}else {
			
			System.out.print(file.length()+"\t");
			}
			
			System.out.println(file.getName()+"");
		}
		File file1= new File("C:/temp/images");
		File file2= new File("C:/temp/images");
		File file3= new File("C:/temp/images");
		//파일 객체 생성

	}
}
